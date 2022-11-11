package org.example.domain.copy;

import org.example.domain.copy.model.Company;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.control.DeepClone;

@Mapper
public interface CopyMapper {

    @BeanMapping(mappingControl = DeepClone.class, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
    Company copy(Company company);

}
