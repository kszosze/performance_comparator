package com.home.performance.repositories;

import java.util.HashMap;
import java.util.Map;

public class HashMapRepository {


    private static final Map<String, ElementType> data = new HashMap<>();

    static {
        data.put("Type1", new ElementType("Type1"));
        data.put("Type2", new ElementType("Type2"));
        data.put("Type3", new ElementType("Type3"));
        data.put("Type4", new ElementType("Type4"));
        data.put("Type5", new ElementType("Type5"));
        data.put("Type6", new ElementType("Type6"));
        data.put("Type7", new ElementType("Type7"));
        data.put("Type8", new ElementType("Type8"));
        data.put("Type9", new ElementType("Type9"));
        data.put("Type10", new ElementType("Type10"));
        data.put("Type11", new ElementType("Type11"));
        data.put("Type12", new ElementType("Type12"));
        data.put("Type13", new ElementType("Type13"));
        data.put("Type14", new ElementType("Type14"));
        data.put("Type15", new ElementType("Type15"));
        data.put("Type16", new ElementType("Type16"));
        data.put("Type17", new ElementType("Type17"));
        data.put("Type18", new ElementType("Type18"));
        data.put("Type19", new ElementType("Type19"));
        data.put("Type20", new ElementType("Type20"));
        data.put("Type21", new ElementType("Type21"));
        data.put("Type22", new ElementType("Type22"));
        data.put("Type23", new ElementType("Type23"));
        data.put("Type24", new ElementType("Type24"));
        data.put("Type25", new ElementType("Type25"));
        data.put("Type26", new ElementType("Type26"));
        data.put("Type27", new ElementType("Type27"));
        data.put("Type28", new ElementType("Type28"));
        data.put("Type29", new ElementType("Type29", new ElementType[]{
                new ElementType("SubType1"),
                new ElementType("SubType2"),
                new ElementType("SubType3")
        }));
    }

    public ElementType findElement(String key) {
        return data.getOrDefault(key, null);
    }

}
