package test;

/**
 * @author hs
 * @date 2019年4月29日, 0029 下午 09:11:12
 */
public class Start
{
    public static void main(String[] args)
    {
        int[] arr={20,60,51,81,285,12,165,51,81,318,186,9,70};
        for(int a:arr)
        {
            System.out.print(a+" ");
        }

        System.out.println("\n"+"---------------从大到小---------------");

        arr=toSmall(arr);
        for(int a:arr)
        {
            System.out.print(a+" ");
        }

        System.out.println("\n"+"---------------从小到大---------------");

        arr=toBig(arr);
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    //    从小到大
    public static int[] toBig(int[] arr)
    {
//遍历数组里除最后一个的其他所有数，因为最后的对象没有与之可以相比较的数
        for(int i=0;i<arr.length-1;i++)
        {
            /*遍历数组里没有排序的所有数，并与上一个数进行比较
             *“k=i+1”因为自身一定等于自身，所以相比没有意义
             *而前面已经排好序的数，在比较也没有意义
             */
            for(int k=i+1;k<arr.length;k++)
            {
                if(arr[k]<arr[i])//交换条件（排序条件）
                {
                    int number=arr[i];
                    arr[i]=arr[k];
                    arr[k]=number;
                }//交换
            }
        }
        return arr;
    }
    //    从大到小
//和前面一样
    public static int[] toSmall(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int k=i+1;k<arr.length;k++)
            {
                if(arr[k]>arr[i])
                {
                    int number=arr[i];
                    arr[i]=arr[k];
                    arr[k]=number;
                }
            }
        }
        return arr;
    }
}
