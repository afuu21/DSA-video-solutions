class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp;
        for(int[] x: image) {
            for(int i=0; i<image.length/2; i++) {
                temp = x[i];
                x[i] = x[image.length-i-1];
                x[image.length-i-1] = temp;
            }
        }
        
        for(int[] x: image) {
            for(int i=0; i<image.length; i++) {
                if(x[i] == 1)
                    x[i]=0;
                else
                    x[i]=1;
            }
        }
        return image;
    }
}