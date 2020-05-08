# BFS代码模板
[地址](https://shimo.im/docs/P8TqKHGKt3ytkYYd/read)
## 模板
```python
def BFS(graph, start, end):
    visited = set()
    queue = []
    queue.append([start])

    while queue:
        node = queue.pop()
        visited.add(node)

        process(node)
        nodes = generate_related_nodes(node)
        queue.push(nodes)

    # other processing work
```
