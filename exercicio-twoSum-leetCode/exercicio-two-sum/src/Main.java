static void main(String [] args)
{
    int[] array = {1, 3, 5, 6};
    System.out.println(twoSum(array, 4));
    System.out.println(twoSum(array, 11));
    System.out.println(twoSum(array, 9));
    System.out.println(twoSum(array, 8));
    System.out.print(twoSum(array, 12));
}

static String twoSum (int[] nums, int target)
{
    int positionI = 0, positionJ = 0;
    boolean found = false;

    for(int i = 0; i < nums.length && !found; i++)
    {
        for(int j = i; j < nums.length && !found; j++)
        {
            if(nums[j] + nums[i] == target)
            {
                if (j != i)
                {
                    positionI = i;
                    positionJ = j;
                    found = true;
                }
            }
        }
    }

    if(!found)
    {
        return "Not Found";
    }

    return "[" + positionI + "," + positionJ + "]";
}