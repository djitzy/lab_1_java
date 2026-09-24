# Черемных Анастасия ИТ-16-2025 Лабораторная №1
## Задание 1
### Задача 1 
### Текст задачи:
<img width="740" height="212" alt="image" src="https://github.com/user-attachments/assets/094d1070-350f-47a8-8110-c2ef08aee94d" />

### Алгоритм решения:
1. Принять символ x
2. Преобразовать символ в число через (int) x
3. Вернуть полученное число (ASCII-код)


### Задача 2
### Текст задачи:
<img width="748" height="281" alt="image" src="https://github.com/user-attachments/assets/2a977427-817f-4dfa-8d10-ab34d21b172a" />


### Алгоритм решения:
1. Принять число x
2. Если x > 0, вернуть true
3. Иначе вернуть false


### Задача 3
### Текст задачи:
<img width="747" height="282" alt="image" src="https://github.com/user-attachments/assets/87cd844e-c4d9-4c6f-9595-70e6d51a1b19" />


### Алгоритм решения:
1. Принять два числа a и b
2. Если a == 0 или b == 0, вернуть false
3. Если a % b == 0 или b % a == 0, вернуть true
4. Иначе вернуть false


### Задача 4
### Текст задачи:
<img width="747" height="282" alt="image" src="https://github.com/user-attachments/assets/d3026713-eb4c-473d-8011-d29529a52e10" />

### Алгоритм решения:
1. Принять три числа a, b, c
2. Если a == b и b == c, вернуть true
3. Иначе вернуть false


### Задача 5
### Текст задачи:
<img width="747" height="327" alt="image" src="https://github.com/user-attachments/assets/fce0d3b4-5dac-4b52-a8d6-676c55d78980" />


### Алгоритм решения:
1. Принять первое число, сохранить как результат
2. В цикле 4 раза:
    - Принять следующее число
    - Извлечь последнюю цифру текущего результата (Math.abs(result) % 10)
    - Извлечь последнюю цифру нового числа (Math.abs(nextNum) % 10)
    - Сложить эти цифры
    - Обновить результат
3. Вывести итоговый результат


## Задание 2
### Задача 1 
### Текст задачи:
<img width="737" height="331" alt="image" src="https://github.com/user-attachments/assets/38ddebb8-93a1-4809-a9a9-d301ff022709" />


### Алгоритм решения:
1. Принять x и y
2. Если y == 0 → вернуть 0
3. Иначе → вернуть (double) x / y


### Задача 2
### Текст задачи:
<img width="742" height="307" alt="image" src="https://github.com/user-attachments/assets/33166d6c-7f4c-47c0-af96-aa511ed38908" />



### Алгоритм решения:
1. Принять три числа x, y, z
2. Предположить, что max = x
3. Если y > max → max = y
4. Если z > max → max = z
5. Вернуть max


### Задача 3
### Текст задачи:
<img width="745" height="306" alt="image" src="https://github.com/user-attachments/assets/7c343131-45ad-4ec9-9724-4532ec274e70" />



### Алгоритм решения:
1. Принять три числа x, y, z
2. Если x + y == z или x + z == y или y + z == x → вернуть true
3. Иначе → вернуть false


### Задача 4
### Текст задачи:
<img width="753" height="310" alt="image" src="https://github.com/user-attachments/assets/d274c98e-9f10-4706-b7aa-c0d9d59c4e9e" />


### Алгоритм решения:
1. Принять x и y
2. Вычислить sum = x + y
3. Если sum >= 10 и sum <= 19 → вернуть 20
4. Иначе → вернуть sum


### Задача 5
### Текст задачи:
<img width="632" height="417" alt="image" src="https://github.com/user-attachments/assets/8bb74e89-423a-4cb8-ad7f-1b48b82d7179" />



### Алгоритм решения:
1. Принять строку x (день недели)
2. Использовать switch для проверки:
    - Для каждого дня вывести его и все последующие дни до воскресенья
3. Если день не распознан → вывести "это не день недели"


## Задание 3
### Задача 1 
### Текст задачи:
<img width="623" height="160" alt="image" src="https://github.com/user-attachments/assets/e6d4873f-5c20-4a44-a960-ddb34f1979d9" />



### Алгоритм решения:
1. Принять число x
2. Создать пустую строку result
3. В цикле от 0 до x:
    - Добавить число к строке с пробелом
4. Вернуть строку


### Задача 2
### Текст задачи:
<img width="632" height="215" alt="image" src="https://github.com/user-attachments/assets/26e0601e-676d-4e86-aa70-b2f47b3fedb1" />



### Алгоритм решения:
1. Принять x (основание) и y (показатель)
2. Создать переменную result = 1
3. В цикле y раз:
    - Умножить result на x
4. Вернуть result


### Задача 3
### Текст задачи:
<img width="630" height="295" alt="image" src="https://github.com/user-attachments/assets/49e85440-3914-4e41-8350-e7fc0ba3e931" />



### Алгоритм решения:
1. Принять число x
2. Если x < 0 → сделать его положительным
3. Если x == 0 → вернуть true
4. Запомнить последнюю цифру: lastDigit = x % 10
5. В цикле, пока x > 0:
    - Извлечь текущую цифру: currentDigit = x % 10
    - Если currentDigit != lastDigit → вернуть false
    - Отбросить последнюю цифру: x /= 10
6. Вернуть true


### Задача 4
### Текст задачи:
<img width="627" height="375" alt="image" src="https://github.com/user-attachments/assets/b0a8b104-f76d-416f-bf34-18abb234abe2" />



### Алгоритм решения:
1. Принять размер x
2. Во внешнем цикле от 0 до x-1:
3. Во внутреннем цикле от 0 до x-1:
  - Вывести *
  - Перейти на новую строку


### Задача 5
### Текст задачи:
<img width="592" height="405" alt="image" src="https://github.com/user-attachments/assets/d3cf12f7-7534-40c8-bf8f-b20706cd069a" />




### Алгоритм решения:
1. Принять высоту x
2. В цикле от 1 до x:
    - Вывести x - i пробелов (для выравнивания)
    - Вывести i символов *
    - Перейти на новую строку



## Задание 4
### Задача 1 
### Текст задачи:
<img width="591" height="183" alt="image" src="https://github.com/user-attachments/assets/876f4924-ec68-4b56-860f-1b36839e6aa2" />



### Алгоритм решения:
1. Принять массив arr и число x
2. В цикле пройти по всем элементам массива:
    - Если arr[i] == x → вернуть индекс i
3. Если не нашли → вернуть -1


### Задача 2
### Текст задачи:
<img width="595" height="187" alt="image" src="https://github.com/user-attachments/assets/0e28edf1-70eb-41f7-ba25-83d5028465d8" />



### Алгоритм решения:
1. Принять массив arr и число x
2. Создать переменную lastIndex = -1
3. В цикле пройти по всем элементам:
    - Если arr[i] == x → обновить lastIndex = i
4. Вернуть lastIndex


### Задача 3
### Текст задачи:
<img width="587" height="197" alt="image" src="https://github.com/user-attachments/assets/8b09478d-9b06-4255-8ba8-e979d50bb03c" />



### Алгоритм решения:
1. Принять arr, ins (вставляемый массив) и позицию pos
2. Создать новый массив размером arr.length + ins.length
3. Копировать элементы из arr с 0 до pos-1 в новый массив
4. Копировать все элементы из ins в новый массив
5. Копировать оставшиеся элементы из arr (с позиции pos до конца)
6. Вернуть новый массив


### Задача 4
### Текст задачи:
<img width="587" height="188" alt="image" src="https://github.com/user-attachments/assets/3ea2583f-beca-4b76-b4ea-84e94fb516ee" />



### Алгоритм решения:
1. Принять два массива arr1 и arr2
2. Создать новый массив размером arr1.length + arr2.length
3. Копировать все элементы из arr1 в начало нового массива
4. Копировать все элементы из arr2 после элементов arr1
5. Вернуть новый массив


### Задача 5
### Текст задачи:
<img width="588" height="143" alt="image" src="https://github.com/user-attachments/assets/ac99ffcc-dce0-476b-b4e7-85a4803f2603" />


### Алгоритм решения:
1. Принять массив arr
2. Первый проход: посчитать количество неотрицательных элементов (count)
3. Создать новый массив размером count
4. Второй проход: копировать только неотрицательные элементы в новый массив
5. Вернуть новый массив
