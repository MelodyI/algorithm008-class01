# DFS 代码模板
[地址](https://shimo.im/docs/ddgwCccJQKxkrcTq/read)
## 递归写法
```python
visited = set()

def dfs(node, visited):
    if node in visited : # terminator
        # already visited
        return

    visited.add(node)

    # process current node here

    for next_node in node.children():
        if next_node not in visited:
            dfs(next_node, visited)
```
## 非递归写法
```python
def DFS(self, tree):
    if tree.root is None:
        return []

    visited, stack = [], [tree.root]

    while stack:
        node = stack.pop()
        visited.add(node)

        process(node)
        nodes = generate_related_nodes(node)
        stack.push(nodes)

    # other processing work
```
