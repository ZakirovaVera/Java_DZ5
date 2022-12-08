// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class task3 {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 76, 34, 23, 32, 17 };
        System.out.println("Массив для сортировки");
        PrintArray(arr);

        HeapSort(arr);

        System.out.println("Сортированный массив");
        PrintArray(arr);
    }

    // печать массива
    public static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // сортировка массива
    public static void HeapSort(int[] array) {
        int n = array.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            Heapify(array, n, i);

        // Один за другим извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            Heapify(array, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i,
    // что является
    // индексом в arr[]. n - размер кучи
    public static void Heapify(int arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;
        // Если правый дочерний элемент больше, чем самый большой элемент на данный
        // момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            Heapify(arr, n, largest);
        }
    }
}
