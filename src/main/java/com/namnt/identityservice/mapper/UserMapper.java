package com.namnt.identityservice.mapper;

import com.namnt.identityservice.dto.request.UserCreationRequest;
import com.namnt.identityservice.dto.request.UserUpdateRequest;
import com.namnt.identityservice.dto.response.UserResponse;
import com.namnt.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}