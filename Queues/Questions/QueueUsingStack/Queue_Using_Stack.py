from Stack import Stack


class Queue:
    def __init__(self):
        self.input_stack = Stack()
        self.output_stack = Stack()
        self.length = 0

    def isEmpty(self):
        return self.length == 0

    def length(self):
        return self.length

    def enqueue(self, item):
        self.input_stack.push(item)
        self.length += 1
        self.input_stack.print_stack()

    def deque(self):
        if self.output_stack.is_stack_empty():
            while not self.input_stack.is_stack_empty():
                self.output_stack.push(self.input_stack.pop())

        temp = None
        if not self.output_stack.is_stack_empty():
            temp = self.output_stack.pop()
            self.length -= 1
        return temp


def main():
    q = Queue()

    for i in range(1, 4):
        q.enqueue(i)

    print "Dequeued: " + str(q.deque())
    print "Dequeued: " + str(q.deque())

    for i in range(4, 6):
        q.enqueue(i)

    while not q.isEmpty():
        print "Dequeued: " + str(q.deque())

if __name__ == '__main__':
    main()
