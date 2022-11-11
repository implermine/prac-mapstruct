package org.example.domain.copy;

import org.example.domain.copy.model.Company;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.control.DeepClone;

@Mapper(
        mappingControl = DeepClone.class
)
public interface CopyMapper {

    Company copy(Company company);

}
