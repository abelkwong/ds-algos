# Insertion sort
def insertionSort(arr):
    for i in range(len(arr)):
        j = i - 1
        while j >= 0 and arr[j+1] < arr[j]:
            tmp = arr[j+1]
            arr[j+1] = arr[j]
            arr[j] = tmp
            j -= 1
        return arr
    
# Merge sort
def mergeSort(arr, s, e):
    if e - s + 1 <= 1:
        return arr
    m = (e + s) // 2
    mergeSort(arr, s, m)
    mergeSort(arr, m+1, e)
    merge(arr, s, m, e)
    return arr

def merge(arr, s, m, e):
    L = arr[s, m]
    R = arr[m+1, e+1]
    i = 0
    j = 0
    k = 0
    while i < len(L) and j < len(R):
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1
    while i < len(L):
        arr[k] = L[i]
        i += 1
        k += 1
    while i < len(R):
        arr[k] = R[j]
        j += 1
        k += 1

# Quick sort
def quickSort(arr, s, e):
    if s == e:
        return arr
    arr[e] == pivot
    L = s
    for i in range(s, e):
        if arr[i] < pivot:
            tmp = arr[L]
            arr[L] = arr[i]
            arr[i] = tmp
            L += 1
    arr[e] = arr[L]
    arr[L] = pivot
    quickSort(arr, s, L-1)
    quickSort(arr, L+1, e)
    return arr