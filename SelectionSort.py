def selectionsort(array):

    n = len(array)

    for i in range(n):
        smallest_index = i
        #determine smallest index
        for j in range(i+1, n):
            if array[j] < array[smallest_index]:
                smallest_index = j
        #swap position of th element with smallest value
        if smallest_index != i:
            array[i],array[smallest_index] = array[smallest_index], array[i]

#testing algorithm
arr = [10,4,6,6 ,1]
selectionsort(arr)
print(arr)