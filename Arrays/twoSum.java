public class twoSum {
    static void main(String[] args) {
        int[] arr={1,5,8,-3};
        int target=2;
        boolean flag=false;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    flag = true;
                    break;
                }
            }
        }
            if (flag==true) {
                System.out.println("mil gaya");
            } else {
                System.out.println("nhi mila");
            }
        }

    }

