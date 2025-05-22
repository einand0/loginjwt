package com.einando.loginjwt.dtos;

import java.util.UUID;

public record UserDTOResponse(UUID id, String name, String email) {}
