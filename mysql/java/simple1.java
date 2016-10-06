this.queryService
.select(
qProject
)
.from(qProject)
.where(qProject.projectType.in("PROJECT","HEART"))