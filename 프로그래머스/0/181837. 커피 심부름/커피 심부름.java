class Solution {
    public int solution(String[] order) {
        int total = 0;
        for (String o : order) {
            switch (o) {
                case "iceamericano":
                case "americanoice":
                case "hotamericano":
                case "americanohot":
                case "americano":
                case "anything": // 차가운 아메리카노로 통일
                    total += 4500;
                    break;
                case "icecafelatte":
                case "cafelatteice":
                case "hotcafelatte":
                case "cafelattehot":
                case "cafelatte": // 차가운 카페라테로 통일
                    total += 5000;
                    break;
            }
        }
        return total;
    }
}
