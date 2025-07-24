 User Roles and Permissions
The system was designed to support two types of users:

Administrator (admin)

Regular User (user)

✅ Admin Capabilities
Had full access to create, read, update, and delete (CRUD) any user and their associated permissions.

Could view all users, regardless of their type.

👤 Regular User Capabilities
Could only view users of their same type (i.e., other regular users).

No access to user creation, modification, or deletion features.

🔄 Role-Based Access Control (RBAC)
The existing login flow was extended to implement role-based access. After a successful login (valid username and password), the system granted or restricted feature access dynamically based on the authenticated user's role.

🎯 Bonus Feature
Each user's dashboard displays the username of the currently logged-in user in the top-right corner of the interface for contextual awareness.
