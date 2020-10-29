/*
 * @lc app=leetcode.cn id=690 lang=java
 *
 * [690] 员工的重要性
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for(Employee employee: employees){
            employeeMap.put(employee.id, employee);
        }

        Queue<Employee> q = new LinkedList<Employee>();
        q.offer(employeeMap.get(id));
        int res = 0;
        while(!q.isEmpty()){
            
            Employee tmp = q.poll();
            res += tmp.importance;
            for(int i = 0; i < tmp.subordinates.size(); i++){
                q.offer(employeeMap.get(tmp.subordinates.get(i)));
            }
        }

        return res;
    }
}
// @lc code=end

