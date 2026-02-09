class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        
        int r  = 0, c = 0;
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    r = i;
                    c = j;
                }
            }
        }
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        String dir = "NSWE";
        
        for (String route : routes) {
            String[] cmd = route.split(" ");
            int d = dir.indexOf(cmd[0]);
            int dist = Integer.parseInt(cmd[1]);
            
            int nr = r;
            int nc = c;
            boolean valid = true;
            
            for(int i =0; i <dist; i++) {
                nr += dr[d];
                nc += dc[d];
                
                if(nr < 0 || nr >= h || nc < 0 || nc >= w
                  || park[nr].charAt(nc) == 'X') {
                    valid = false;
                    break;
                }
            }
            
            if(valid) {
                r = nr;
                c = nc;
            }
        }
        return new int[]{r, c};
    }
}