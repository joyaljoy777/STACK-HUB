
'''
    How to run the code
    
    *)  Navigate to the folder
    *)  python BubbleSorting_python_Solution.py
'''

def bubbleSort(arr):
    n = len(arr)
    
    if n == 0:
        return [];
        
    for i in range(n-1):
        for j in range(0, n-i-1):
            if arr[j] > arr[j + 1]:
                # Swap the elements
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

arr = [7, 4, -9, -6, 2]
bubbleSort(arr)
 
print("Sorted array is:")
for i in range(len(arr)):
    print("% d" % arr[i], end=" ")