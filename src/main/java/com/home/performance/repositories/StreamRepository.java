package com.home.performance.repositories;

import lombok.NoArgsConstructor;

import java.util.stream.Stream;

@NoArgsConstructor
public class StreamRepository {

    private ElementType[] data = {
            new ElementType("Type1"),
            new ElementType("Type2"),
            new ElementType("Type3"),
            new ElementType("Type4"),
            new ElementType("Type5"),
            new ElementType("Type6"),
            new ElementType("Type7"),
            new ElementType("Type8"),
            new ElementType("Type9"),
            new ElementType("Type10"),
            new ElementType("Type11"),
            new ElementType("Type12"),
            new ElementType("Type13"),
            new ElementType("Type14"),
            new ElementType("Type15"),
            new ElementType("Type16"),
            new ElementType("Type17"),
            new ElementType("Type18"),
            new ElementType("Type19"),
            new ElementType("Type20"),
            new ElementType("Type21"),
            new ElementType("Type22"),
            new ElementType("Type23"),
            new ElementType("Type24"),
            new ElementType("Type25"),
            new ElementType("Type26"),
            new ElementType("Type27"),
            new ElementType("Type28"),
            new ElementType("Type28", new ElementType[]{
                    new ElementType("SubType1"),
                    new ElementType("SubType2"),
                    new ElementType("SubType3")
            })
    };


    public ElementType findElement(String key) throws Exception {
        return Stream.of(data)
                .filter(elementType -> key.equals(elementType.getCode()))
                .findFirst()
                .orElseThrow(Exception::new);
    }
}
