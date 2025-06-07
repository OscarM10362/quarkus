package com.beesion.ms.test.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookDto {
	private Long id;
	private String title;
	private int numPages;
	private LocalDate pubDate;
	private String description;

    public static class PersonDto {

        private Long id;
        private String name;

        public Long getId() { return id; }

        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }
    }
}
