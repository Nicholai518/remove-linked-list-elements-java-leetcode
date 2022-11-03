public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode four = new ListNode(4);
        ListNode secondTwo = new ListNode(2, four);
        ListNode three = new ListNode(3, secondTwo);
        ListNode firstTwo = new ListNode(2, three);
        ListNode head = new ListNode(1, firstTwo);

        ListNode exampleOne = solution.removeElements(head, 2);

        System.out.println("Example One : ");
        while (true) {
            System.out.print(exampleOne.val + " ");

            if (exampleOne.next != null) {
                exampleOne = exampleOne.next;
            } else {
                break;
            }
        }
    }
}
