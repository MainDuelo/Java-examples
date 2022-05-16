package org.example.mapper;

import org.example.dto.UserDTO;
import org.example.entity.AddressEntity;
import org.example.entity.DocumentEntity;
import org.example.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserMapperTest {

    @Test
    public void userEntityToUserDTO_Ok_Test() {
        AddressEntity addressEntity1 = new AddressEntity(1, "street1", "br");
        AddressEntity addressEntity2 = new AddressEntity(2, "street2", "fr");

        UserEntity userEntity = new UserEntity();
        userEntity.setNameUser("Test");
        userEntity.setAge(18);
        userEntity.setAddressTeste1(addressEntity1);
        userEntity.setAddressTeste2(addressEntity2);
        userEntity.setDocumentsTeste(Arrays.asList(new DocumentEntity("RG", "432432423"),new DocumentEntity("CPF", "5435435436547")));

        UserDTO userDTO = UserMapper.INSTANCE.userEntityToUserDTO(userEntity);
        assertEquals(userEntity.getNameUser(), userDTO.getName());
        assertEquals(userEntity.getAge(), userDTO.getAge());
        assertEquals(userEntity.getAddressTeste1().getNumber(), userDTO.getAddress1().getNumber());
        assertEquals(userEntity.getAddressTeste1().getStreetName(), userDTO.getAddress1().getStreet());
        assertEquals(userEntity.getAddressTeste2().getNumber(), userDTO.getAddress2().getNumber());
        assertEquals(userEntity.getAddressTeste2().getStreetName(), userDTO.getAddress2().getStreet());
        assertEquals(userEntity.getAddressTeste1().getCountry(), userDTO.getCountry());
        assertEquals(userEntity.getDocumentsTeste().get(0).getCode(), userDTO.getDocuments().get(0).getCode());
        assertEquals(userEntity.getDocumentsTeste().get(0).getTypeName(), userDTO.getDocuments().get(0).getType());
        assertEquals(userEntity.getDocumentsTeste().get(1).getCode(), userDTO.getDocuments().get(1).getCode());
        assertEquals(userEntity.getDocumentsTeste().get(1).getTypeName(), userDTO.getDocuments().get(1).getType());
    }
}
