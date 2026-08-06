class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append("<>@");
            if (s.isEmpty()) {
                sb.append("!");   // marker for empty string
            } else {
                sb.append(s);
            }
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        String[] parts = str.split("<>@");
        List<String> result = new ArrayList<>();

        for (int i = 1; i < parts.length; i++) {
            if (parts[i].equals("!")) {
                result.add("");      // empty string
            } else {
                result.add(parts[i]);
            }
        }

        return result;
    }
}
