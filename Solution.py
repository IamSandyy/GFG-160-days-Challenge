def getSecondLargest(self, arr):
    sorted_list = sorted(arr)  
    largest = sorted_list[-1]  
    for i in range(len(arr) - 2, -1, -1):  
        if sorted_list[i] < largest: 
            return sorted_list[i]  
    return None