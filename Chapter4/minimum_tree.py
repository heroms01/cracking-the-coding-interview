class Node:
    def __init__(self, value, children):
        self.value = value
        self.children = children

    def print_info(self):
        print("value : %s" % self.value)
        for c in self.children or []:
            print("  children : %s" % c.value)

# node1 = Node(1, None)
# node2 = Node(2, None)
# node3 = Node(3, [node1, node2])
# node3.print_info()


nodes = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for n in nodes:
    print(n)
