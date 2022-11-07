```
class Tree{
    private List<Leaf> leafs;
}

class Leaf{
    private String name;
}

interface Mapper{
    List<Leaf> toList(Tree tree); // [Problem 1] 요런 unwrapping method가 필요함 
}

[Sol 1]답없음 default mapping 써야함

[Problem 2] List가 null일때, Collection.emptyList()를 반환하게끔 하고싶음.

[Sol 2] @IterableMapping(nullvaluemapping~~)
```