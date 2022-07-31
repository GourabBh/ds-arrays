interface ArrInput {
  input: Array<number>;
  d: number;
  decision: string;
}

const arrInput: ArrInput = {
  input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
  d: 3,
  decision: 'RIGHT',
};

function rightRotate(arrInput: ArrInput): Array<number> {
  const d = arrInput.d;
  const arr = arrInput.input,
    n = arrInput.input.length;
  if (d == 0 || d == n) {
    return arr;
  }
  let dComp = n - d;
  dComp %= n;
  let i = dComp,
    j = n - dComp;

  while (i != j) {
    if (i > j) {
      swap(arr, dComp - i, dComp, j);
      i -= j;
    } else {
      swap(arr, dComp - i, dComp + j - i, i);
      j -= i;
    }
  }
  swap(arr, dComp - i, dComp, i);
  return arr;
}

function swap(arr: Array<number>, fi: number, si: number, d: number): void {
  let i: number, temp: number;
  for (i = 0; i < d; i++) {
    temp = arr[fi + i];
    arr[fi + i] = arr[si + i];
    arr[si + i] = temp;
  }
}

console.log(`Rotated Array: [${rightRotate(arrInput)}]`);
