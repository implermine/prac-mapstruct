```
class Tree{
    private List<Leaf> leafs;
}

class Leaf{
    private String name;
}

interface Mapper{
    List<Leaf> toList(Tree tree); // 요런 unwrapping method가 필요함
}
```