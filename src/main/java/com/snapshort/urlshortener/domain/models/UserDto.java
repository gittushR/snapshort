package com.snapshort.urlshortener.domain.models;

import java.io.Serializable;

/**
 * DTO for {@link com.snapshort.urlshortener.domain.entities.User}
 */
public record UserDto(Long id, String name) implements Serializable {
}