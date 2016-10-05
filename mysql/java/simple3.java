this.queryService
.select(
qProjectEpisode
)
.from(qProject)
.from(qProjectEpisode)
.where(qProject.projectId.eq(qProject.projectId))