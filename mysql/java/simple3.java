this.queryService
.select(
qProjectEpisode
)
.from(qProject)
.from(qProjectEpisode)
.where(qProjectEpisode.projectId.eq(qProject.projectId))