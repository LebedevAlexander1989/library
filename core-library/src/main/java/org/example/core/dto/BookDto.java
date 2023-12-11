package org.example.core.dto;

import lombok.*;
import org.example.core.domain.StatusBook;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDto {
    private Integer id;
    private String name;
    private Integer numberShelf;
    private StatusBook statusBook;
}