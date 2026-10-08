class MyHashSet:

    def __init__(self):
        self.dict = set()
        

    def add(self, key: int) -> None:
        self.dict.add(key)
        
        

    def remove(self, key: int) -> None:
        if key in self.dict:
            self.dict.remove(key)
        

    def contains(self, key: int) -> bool:
        return key in  self.dict        


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)