package org.example.manual._5_;

import org.example.manual._5_.domain.Car;
import org.example.manual._5_.domain.CarDto;
import org.example.manual._5_.domain.Person;
import org.example.manual._5_.domain.PersonDto;
import org.example.manual._5_.domain.customMethod.*;
import org.example.manual._5_.domain.nested.dto.FishTankDto;
import org.example.manual._5_.domain.nested.dto.FishTankWithNestedDocumentDto;
import org.example.manual._5_.domain.nested.model.FishTank;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface Manual5Mapper {


    /**
     * 5.2 Mapping object references
     *
     * Mapper with one mapping method using another
     *
     * The generated code for the carToCarDto() method will invoke the personToPersonDto()
     */
    CarDto toDto(Car car);
    // explicitly가 아닌 implicitly하게 이 Method를 CarDto toDto(Car car) 메서드가 선택해서 사용한다.
    // 근데 문제는 만약에 안만들어 두더라도, MapStruct가 알아서 personToPersonDto 메서드를 만들어준다.
    // 이를 방지하려면, @Mapper(disableSubMappingMethodsGeneration = true) 를 이용한다.
    PersonDto toDto(Person person);

    /**
     * 5.3 Controlling nested bean mappings
     *
     *  3.5 Mapping nested bean properties to current target 의 좀 더 specific 한 버전이다.
     */
    @Mapping(target = "fish.kind", source = "fish.type")
    @Mapping(target = "fish.name", ignore = true)
    @Mapping(target = "ornament", source = "interior.ornament")
    @Mapping(target = "material.materialType", source = "material")
    @Mapping(target = "quality.report.organisation.name", source = "quality.report.organisationName")
    FishTankDto map(FishTank source);

    @Mapping(target = "fish.kind", source = "fish.type")
    @Mapping(target = "fish.name", expression = "java(\"Jaws\")")
    @Mapping(target = "plant", ignore = true )
    @Mapping(target = "ornament", ignore = true )
    @Mapping(target = "material", ignore = true)
    @Mapping(target = "quality.document", source = "quality.report")
    @Mapping(target = "quality.document.organisation.name", constant = "NoIdeaInc" )
    FishTankWithNestedDocumentDto map2(FishTank source);


    /**
     * 5.4 Invoking custom mapping method
     *
     * Sometimes mappings are not straightforward and some fields require custom logic.
     *
     */
    @Mapping(target = "rectangleArea",source = "rectangle")
    DiagramDto fromDiagramToDiagramDto(Diagram diagram);

    default int calculateRectangleArea(Rectangle rectangle){
        if (rectangle==null){
            return 0;
        }
        return rectangle.getWidth() * rectangle.getHeight();
    }

    @Mapping(target = "area", source = "triangle") // indicating the parameter itself
    Result fromTriangleToResult(Triangle triangle);

    default int calculateTriangleArea(Triangle triangle){
        if(triangle ==null){
            return 0;
        }
        return triangle.getX() * triangle.getY();
    }

    /**
     * 5.9 Mapping method selection based on qualifiers
     *
     * custom mapping method를 name을 붙여서 부른다.
     */
    @Mapping(target = "area", source = "triangle", qualifiedByName = {"calculateTriangleArea2"})
    Result fromTriangleToResult2(Triangle triangle);

    @Named("calculateTriangleArea2")
    default int calculateTriangleArea2(Triangle triangle){
        return 0;
    }

}
