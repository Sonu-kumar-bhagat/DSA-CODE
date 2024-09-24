public class Lect_46 {
    static int minimumIdx(int a[]) {
        int st = 0, end = a.length - 1, ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] > a[a.length - 1])
                st = mid + 1;
            else if (a[mid] <= a[a.length - 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int searchDub(int a[], int target) {
        int st = 0, n = a.length, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target)
                return mid;
            else if (a[mid] == a[st] && a[mid] == a[end]) {
                st++;
                end--;
            } else if (a[mid] <= a[end]) {
                if (target >= a[mid] && target <= a[end])
                    st = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (target >= a[st] && target <= a[mid])
                    end = mid - 1;
                else
                    st = mid + 1;
            }
        }
        return -1;
    }

    static int search(int a[], int target) {
        int st = 0, n = a.length, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target)
                return mid;
            else if (a[mid] < a[end]) {
                if (target >= a[mid] && target <= a[end])
                    st = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (target >= a[st] && target <= a[mid])
                    end = mid - 1;
                else
                    st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int a[]={3,4,5,1,2};
        int a[] = { 1, 1, 2, 3, 1, 1 };
        // System.out.println(minimumIdx(a));
        // System.out.println(search(a, 12));
        System.out.println(searchDub(a, 3));
    }
}