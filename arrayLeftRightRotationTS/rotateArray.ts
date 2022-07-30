interface ArrayInput {
  input: Array<number>;
  d: number;
  decision: string;
}

const gcd = (m: number, n: number): number => {
  if (!n) {
    return m;
  }
  return gcd(n, m % n);
};

const rotateArray = (arrayInput: ArrayInput): number[] => {
  let ar = arrayInput.input,
    i: number,
    j: number,
    k: number,
    temp: number,
    d = arrayInput.d;
  const decision = arrayInput.decision,
    n = ar.length,
    gcDiv = gcd(n, d);
  if (d) {
    d %= n;
  }

  for (i = 0; i < gcDiv; i++) {
    temp = ar[i];
    j = i;
    while (true) {
      if (decision === 'LEFT') {
        k = j + d;
      } else {
        k = j + (n - d);
      }
      if (k >= n) {
        k -= n;
      }
      if (k == i) {
        break;
      }
      ar[j] = ar[k];
      j = k;
    }
    ar[j] = temp;
  }
  return ar;
};

const arrayInput: ArrayInput = {
  input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12],
  d: 3,
  decision: 'RIGHT',
};

console.log(`Rotated Array: [${rotateArray(arrayInput)}]`);
