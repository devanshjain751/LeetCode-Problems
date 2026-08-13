class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       vector<int> result;
        unordered_map<int, int> hp; //value: index
        for(int i=0; i< nums.size(); i++){
            
            int res = target - nums[i];
            if(hp.find(res) != hp.end()){
                result.push_back(hp[res]);
                result.push_back(i);
                return result;
            }
            else{
                hp[nums[i]] = i;
            }
            
        }
        
        return {};
    }
};