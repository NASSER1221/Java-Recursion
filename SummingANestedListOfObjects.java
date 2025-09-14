import java.util.List;
import java.util.ArrayList;
import java.util.Stack;


public class SummingANestedListOfObjects {

    class Item {
        private int value;
        public Item(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    class Container {
        private Item item;
        private List<Container> containers;
        public Container(Item item) {
            this.item = item;
            this.containers = null;
        }
        public Container(List<Container> containers) {
            this.item = null;
            this.containers = containers;
        }
        public boolean isItem() {
            return item != null;
        }
        public Item getItem() {
            return item;
        }
        public List<Container> getContainers() {
            return containers;
        }
    }
    class ValueCalculator {
        /**
         * TO-DO: Convert this method to be recursive.
         * \*
         * This method sums the value of all Items within a nested container structure.
         * The current approach uses a Stack for an iterative, depth-first traversal.
         * \*
         *
         * @param container The top-level container.
         * @return The sum of all values.
         */
        public int calculateTotalValue(Container container,int cont) {

            if (cont>=container.containers.size())return container.item.getValue();

            else return container.item.getValue()+
                    calculateTotalValue(container.containers.get(cont), 0)+
                    calculateTotalValue(container,cont+1);
//            int totalValue = 0;
//            Stack<Container> stack = new Stack<>();
//            stack.push(container);
//            while (!stack.isEmpty()) {
//                Container current = stack.pop();
//                if (current.isItem()) {
//                    totalValue += current.getItem().getValue();
//                } else {
//                    for (Container nestedContainer : current.getContainers()) {
//                        stack.push(nestedContainer);
//                    }
//                }
//            }
//            return totalValue;
        }
    }

}
