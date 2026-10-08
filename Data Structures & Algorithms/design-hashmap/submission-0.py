class MyHashMap:

    def __init__(self):
        self.dict = {}


    def put(self, key: int, value: int) -> None:
        if self.dict.get(key):
            self.dict[key] = self.dict.get(key) + 1

        # Ispravno — samo postavi key → value
        self.dict[key] = value 
        

    def get(self, key: int) -> int:
       return self.dict.get(key, -1)
        

    def remove(self, key: int) -> None:
        self.dict.pop(key, None)         


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)