class MLWorker(security: SecurityProtocol) {
  private val spark = SparkSession.builder().getOrCreate()

  def processJob(job: MLJob): MLResult = {
    // Decrypt data securely
    val decryptedData = security.decryptData(job.data)
    
    // Process with Spark
    val pipeline = job.model
    val result = pipeline.fit(decryptedData)
    
    // Encrypt results
    val secureResult = security.encryptData(result)
    MLResult(job.id, secureResult)
  }
}
