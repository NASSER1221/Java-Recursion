
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class ManipulatingAGUIComponentHierarchy {


    class Component {
        private String id;
        private boolean enabled = true;
        private List<Component> children = new ArrayList<>();
        public Component(String id) {
            this.id = id;
        }
        public void add(Component component) {
            children.add(component);
        }
        public List<Component> getChildren() {
            return children;
        }
        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
            System.out.println("Component " + id + " set to " + (enabled ? "enabled" : "disabled"));
        }
    }
    class ComponentManager {
        /**
         * TO-DO: Refactor this iterative method into a recursive one.
         \*
         * This method disables a component and all of its descendants. The current
         * implementation uses a Queue to perform a breadth-first traversal.
         \*
         * @param root The component to start with.
         */

        public void disableAll(Component root,int index){
            if (index==0) root.setEnabled(false);
            if (index>=root.children.size()) return;
            root.children.get(index).setEnabled(false);
            disableAll(root.children.get(index),0);
            disableAll(root,index+1);


//        public void disableAll(Component root) {
//            Queue<Component> queue = new LinkedList<>();
//            queue.offer(root);
//            while (!queue.isEmpty()) {
//                Component current = queue.poll();
//                current.setEnabled(false);
//                for (Component child : current.getChildren()) {
//                    queue.offer(child);
                }
            }
        }




