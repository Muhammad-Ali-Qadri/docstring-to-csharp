public void serialize(LittleEndianOutput out) {out.writeShort(Venter);}
public void addAll(List<E> src) {while (count < src.size())add(src.get(count++));}
public void writeByte(int v) {checkPosition(1);_buf[_writeIndex++] = (byte)v;}
public ObjectId getObjectId() {return object;}
public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) {request = beforeClientExecution(request);return executeDeleteDomainEntry(request);}
public long ramBytesUsed() {return ((termOffsets!=null)? termOffsets.ramBytesUsed() : 0) +((termsDictOffsets!=null)? termsDictOffsets.ramBytesUsed() : 0);}
public final String getFullMessage() {byte[] raw = buffer;int msgB = RawParseUtils.commitMessage(raw, 0);if (msgB < 0) {return ""; }return RawParseUtils.decode(guessEncoding(), raw, msgB, raw.length);}
public CreatePOIFSFileSystemResult createPOIFS(CreatePOIFSRequest request) {request = beforeClientExecution(request);return executeCreatePOIFS(request);}
public ByteBlock(final long address) {assert address >= 0;this.address = address;this.bytes = new byte[address];this.length = length;}
public SubmoduleCommand setPath(String path) {checkCallable();this.path = path;return this;}
public ListInsertsResult listInserts(ListInsertsRequest request) {request = beforeClientExecution(request);return executeListInserts(request);}
public QueryParserTokenManager(CharStream stream, int lexState){this(stream);SwitchTo(lexState);}
public ShardIterator shardIterator(int shardId) {return shardIterator;}
public ModifyStrategyRequest() {super("cr", "2016-06-07", "ModifyStrategy", "cr");setUriPattern("/modifyStrategy");setMethod(MethodType.POST);}
public boolean ready() throws IOException {return false;}
public boolean getOptRecord() {return optRecord;}
public void readFully(byte[] buffer, int offset, int length) throws IOException {checkReadPrimitiveTypes();primitiveTypes.readLength(buffer, offset, length);}
public List<NLPSentenceBreak> getWordIterator(String sentenceOperation) {return getWordIterator(sentenceOperation, null);}
public void println(String str) {synchronized (lock) {print(str);}}
public NotImplementedFunctionException(String functionName, Throwable cause) {super(cause);this.functionName = functionName;this.cause = cause;}
public V next() {return nextEntry().value; }
public ByteBuffer get(byte[] dst, int dstOffset, int byteCount) {Arrays.checkOffsetAndCount(dst.length, dstOffset, byteCount);if (byteCount > remaining()) {throw new BufferUnderflowException();}for (int i = dstOffset; i < dstOffset + byteCount; ++i) {dst[i] = get();}return this;}
public TagQueueResult tagQueue(TagQueueRequest request) {request = beforeClientExecution(request);return executeTagQueue(request);}
public void remove() {throw new UnsupportedOperationException();}
public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) {request = beforeClientExecution(request);return executeModifyCacheSubnetGroup(request);}
public void setLanguage(String language, String country, String variant) {setLanguage(language);setCountry(country);setVariant(variant);}
public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) {request = beforeClientExecution(request);return executeDeleteDocumentationVersion(request);}
public boolean equals(Object o) {if (this == o) {return true;}if (o == null || getClass()!= o.getClass()) {return false;}FacetLabel other = (FacetLabel) o;if (x!= other.x) {return false;}return true;}
public GetInstanceAccessDetails describeInstanceAccess(DescribeInstanceAccessRequest request) {request = beforeClientExecution(request);return executeDescribeInstanceAccessDetails(request);}
public HSSFPolygon createPolygon(HSSFClientAnchor anchor) {HSSFPolygon shape = new HSSFPolygon(null, anchor);addShape(shape);onCreate(shape);return shape;}
public String getSheetName(int sheetIndex) {return _uBook.getSheetName(sheetIndex);}
public GetDashboardResult getDashboard(GetDashboardRequest request) {request = beforeClientExecution(request);return executeGetDashboard(request);}
public AssociateAWSAccountResult associateAWSAccount(AssociateAWSAccountRequest request) {request = beforeClientExecution(request);return executeAssociateAWSAccount(request);}
public void addBlanks(String[] blanks) {addBlanks(0, blanks);}
public String quote(String in) {final StringBuilder r = new StringBuilder();r.append('\'');int start = 0, i = 0;for (; i < in.length(); i++) {switch (in.charAt(i)) {case '\'':case '!':r.append(in, start, i);r.append('\'');r.append('\\');r.append(in.charAt(i));r.append('\'');start = i + 1;break;}}r.append(in, start, i);r.append('\'');return r.toString();}
public ByteBuffer putInt(int value) {throw new ReadOnlyBufferException();}
public int[] set(int[] array, int arrayOffset, int arraySize) {if (arraySize < 2) {throw new IllegalArgumentException("Invalid array size: " + arrayOffset + " arraySize=" + arraySize);}if (arraySize < 2) {throw new IllegalArgumentException("Invalid array size: " + arraySize + " arraySize=" + arraySize);}this.arrayOffset = arrayOffset;this.arraySize = arraySize;if (arraySize < 3) {throw new IllegalArgumentException("Invalid array size: " + arraySize + " arraySize=" + arraySize);}return array;}
public DescribeIceServerConfigurationResult describeIceServerConfiguration(DescribeIceServerConfigurationRequest request) {request = beforeClientExecution(request);return executeDescribeIceServerConfiguration(request);}
public String toString() {return getClass().getName() + " [" +getStringValue() +"]";}
public String toString(String field) {return "ToBlockJoinQuery ("+childBlock.toString()+")";}
public int IncRef() {if (!initDone) {initDone = true;} else {assert count > 0: Thread.currentThread().getName() + ": RefCount is 0 pre-increment for file \"" + fileName + "\"";}return ++count;}
public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) {request = beforeClientExecution(request);return executeUpdateConfigurationSetSendingEnabled(request);}
public int getFirstXBATOffset() {return first_xbat_offset;}
public static double mult(double number, int powerOfTen) {return number * number/powerOfTen;}
public String toString() {return "fileName=" + fileName + " size=" + size;}
public void setCredentialsFetcher(AlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlgAlg
public PushCommand setProgressMonitor(ProgressMonitor monitor) {checkCallable();if (monitor == null) {monitor = NullProgressMonitor.INSTANCE;}this.monitor = monitor;return this;}
public void reset() {if (!first()) {ptr = treeStart;nextSubtreePos = 0;currentEntry = null;currentSubtree = null;if (!eof())parseEntry();}}
public E previous() {if (expectedModCount == modCount) {try {E result = get(pos);lastPosition = pos;pos--;return result;} catch (IndexOutOfBoundsException e) {throw new NoSuchElementException();}}throw new ConcurrentModificationException();}
public char getNewPrefix() {return newPrefix;}
public int indexOfValue(E value) {if (mGarbage) {gc();}for (int i = 0; i < mSize; i++)if (mValues[i] == value)return i;return -1;}
public synchronized ListUniqueWords(String word) {ListUniqueWords stems = new ListUniqueWords(word);for (int i = 0; i < word.length(); i++) {String s = word.substring(0, i).toLowerCase(Locale.ROOT);String str = str.substring(i + 1);if (str.length() > 0) {stems.add(str);}}return stems;}
public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) {request = beforeClientExecution(request);return executeGetGatewayResponses(request);}
public void mark(int readLimit) throws IOException {if (readLimit < 0) {throw new IllegalArgumentException();}synchronized (lock) {checkNotClosed();markpos = pos;}}
public long skip(long byteCount) throws IOException {if (byteCount < 0) {throw new IllegalArgumentException("byteCount < 0: " + byteCount);}synchronized (lock) {checkNotClosed();if (byteCount < 1) {return 0;}if (end - pos >= byteCount) {pos += byteCount;return byteCount;}long read = end - pos;pos = end;while (read < byteCount) {if (fillBuf() == -1) {return read;}if (end - pos >= byteCount - read) {pos += byteCount - read;return byteCount;}read += (end - pos);pos = end;}return byteCount;}}
public BootstrapActionConfig(String name, ScriptBootstrapActionConfig scriptBootstrapActionConfig) {setName(name);setScriptBootstrapActionConfig(scriptBootstrapActionConfig);}
public void serialize(LittleEndianOutput out) {out.writeShort(sid);out.writeShort(0x00);out.writeShort(0x01);out.writeShort(0x00);out.writeShort(0x00);out.writeShort(0x00);}
public int lastIndexOf(char s[], int len) {if (s == 0) {return len-1;}int pos = 0;for (int i = 0; i < s.length; i++) {if (s[i] == s[pos]) {pos++;return i;}}}return -1;}
public void addLast(E object) {addLastImpl(object);}
public void unset(String section, String subsection) {if (null == section || null == subsection) {throw new NullPointerException();}this.section = section;this.subsection = subsection;}
public String getTag() {return tag;}
public boolean addSubRecord(SubRecord o) {return subrecords.add(o);}
public boolean remove(Object object) {Iterator<?> it = iterator();if (object!= null) {while (it.hasNext()) {if (object.equals(it.next())) {it.remove();return true;}}} else {while (it.hasNext()) {if (it.next() == null) {it.remove();return true;}}}return false;}
public DoubleMetaphoneFilter(double min, double max, double value) {super(min, max);this.value = min;this.value = value;}
public long getSize() {return delegate().getSize();}
public void setValue(boolean value) {_value = value? 1 : 0;_isError = false;}
public CreateContentSourcesResult createContentSources(CreateContentSourcesRequest request) {request = beforeClientExecution(request);return executeCreateContentSources(request);}
public long get(int index) {final int o = index >>> 1;final int b = index & 1;final int shift = b << 5;return (blocks[o] >>> shift) & 4294967295L;}
public CreateRepoRequest() {super("cr", "2016-06-07", "CreateRepo", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]");setMethod(MethodType.PUT);}
public boolean isDeltaBaseAsOffset() {return deltaBaseAsOffset == 0;}
public void remove() {if (last == null) {throw new IllegalStateException();}removeInternal(last);expectedModCount = modCount;last = null;}
public MergeShardsResult mergeShards(MergeShardsRequest request) {request = beforeClientExecution(request);return executeMergeShards(request);}
public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) {request = beforeClientExecution(request);return executeAllocateHostedConnection(request);}
public int getStartIndex() {return start;}
public static final WeightedTerm[] getTerms(Query query, boolean prohibited){return getTerms(query,prohibited,null);}
public LongBuffer compact() {throw new ReadOnlyBufferException();}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long byte0 = blocks[blocksOffset++] & 0xFF;final long byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte0 << 2) | (byte1 >>> 6);final long byte2 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 63) << 4) | (byte2 >>> 4);final long byte3 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte2 & 15) << 6) | (byte3 >>> 2);final long byte4 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte3 & 3) << 8) | byte
public String getName() {return name;}
public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) {request = beforeClientExecution(request);return executeDescribeNotebookInstanceLifecycleConfig(request);}
public String getAccessKeySecret() {return accessKeySecret;}
public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest request) {request = beforeClientExecution(request);return executeCreateVpnConnection(request);}
public ListVoiceResult listVoice(ListVoiceRequest request) {request = beforeClientExecution(request);return executeListVoice(request);}
public ListExecutionsResult listExecutions(ListExecutionsRequest request) {request = beforeClientExecution(request);return executeListExecutions(request);}
public GetVaultJobRequest(String vaultName, String jobId) {setVaultName(vaultName);setJobId(jobId);}
public EscherRecord getEscherRecord(int index) {return escherRecords.get(index);}
public GetAppsResult getApps(GetAppsRequest request) {request = beforeClientExecution(request);return executeGetApps(request);}
public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest request) {request = beforeClientExecution(request);return executeDeleteSmsChannel(request);}
public TrackingRefUpdate getTrackingRefUpdate() {return trackingRefUpdate;}
public void print(boolean bool) {print(String.valueOf(bool));}
public Token getFirstChild() {Token t = token;if (t.getType() == Token.EOF) {return null;}return (token.getType() == Token.EOF)? null : token.getFirstChild();}
public StatusCommand setWorkingDirectoryTreeIndex(int index) {this.workingDirectoryTreeIndex = index;return this;}
public AreaRecord(RecordInputStream in) {field_1_area_number = in.readShort();}
public GetThumbnailRequest() {super("CloudPhoto", "2017-07-11", "GetThumbnail", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) {request = beforeClientExecution(request);return executeDescribeTransitGatewayVpcAttachments(request);}
public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) {request = beforeClientExecution(request);return executePutVoiceConnectorStreamingConfiguration(request);}
public synchronized int getOrdRange(int dimension) {return ordinalRange[dimension];}
public String toString() {final StringBuilder r = new StringBuilder();r.append(getSeverity().name().toLowerCase(Locale.ROOT));r.append(": at offset "); r.append(getOffset());r.append(": "); r.append(getMessage());r.append("\n"); r.append("  in "); r.append(getLineText());return r.toString();}
public E getFirst() {return getFirstImpl();}
public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) {request = beforeClientExecution(request);return executeCreateWorkspaces(request);}
public BottomMarginRecord clone() {return copy();}
public ListRepositoriesResult listRepositories(ListRepositoriesRequest request) {request = beforeClientExecution(request);return executeListRepositories(request);}
public IntList createSparseArray(int initialCapacity) {if (initialCapacity < 0) {throw new IllegalArgumentException();}this.initialCapacity = initialCapacity;this.count = 0;}
public HyphenatedWordsFilter create(Map<String, String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) {request = beforeClientExecution(request);return executeCreateDistributionWithTags(request);}
public static RandomAccessFile create(String fileName) throws IOException {return new RandomAccessFile(fileName);}
public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) {request = beforeClientExecution(request);return executeDeleteWorkspaceImage(request);}
public static String longToHex(long value) {StringBuilder sb = new StringBuilder(18);writeHex(sb, value, 16, "0x");return sb.toString();}
public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) {request = beforeClientExecution(request);return executeUpdateDistribution(request);}
public HSSFColor getColor(int index) {return color;}
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {int nIncomingArgs = args.length;if(nIncomingArgs < 1) {throw new RuntimeException("function name argument missing");}ValueEval nameArg = args[0];String functionName;if (nameArg instanceof FunctionNameEval) {functionName = ((FunctionNameEval) nameArg).getFunctionName();} else {throw new RuntimeException("First argument should be a NameEval, but got ("+ nameArg.getClass().getName() + ")");}FreeRefFunction targetFunc = ec.findUserDefinedFunction(functionName);if (targetFunc == null) {throw new NotImplementedFunctionException(functionName);}int nOutGoingArgs = nIncomingArgs -1;ValueEval[] outGoingArgs = new ValueEval[nOutGoingArgs];System.arraycopy(args, 1, outGoingArgs, 0, nOutGoingArgs);return
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_number_of_sheets);if(isExternalReferences()) {StringUtil.writeUnicodeString(out, field_2_encoded_url);for (String field_3_sheet_name : field_3_sheet_names) {StringUtil.writeUnicodeString(out, field_3_sheet_name);}} else {int field2val = _isAddInFunctions? TAG_ADD_IN_FUNCTIONS : TAG_INTERNAL_REFERENCES;out.writeShort(field2val);}}
public DescribeDBEngineVersionsResult describeDatabaseEngineVersions() {return describeDatabaseEngineVersions(new DescribeDBEngineVersionsRequest());}
public FontIndex( char c, int fontIndex) {this.c = c;this.fontIndex = fontIndex;}
public static byte[] convert(char[] src, int srcOff, int srcLen) {return convert(src, srcOff, srcLen, false);}
public UploadArchiveResult uploadArchive(UploadArchiveRequest request) {request = beforeClientExecution(request);return executeUploadArchive(request);}
public List getHiddenTokensFromLeft() {return hiddenTokensFromLeft;}
public boolean equals(Object o) {if (this == o) {return true;}else if (!(o instanceof AutomatonQuery)) {return false;}AutomatonQuery other = (AutomatonQuery)o;return Boolean.valueOf(other.getValue());}
public SpanClause createSpanClause(WeightBySpanQuery weightBySpanQuery) {if (weightBySpanQuery == null) {return null;}if ((weightBySpanQuery.weight() < 0) || (weightBySpanQuery.weight() > 1)) {return null;}SpanQueryBuilder builder = new SpanQueryBuilder();builder.addAll(weightBySpanQuery.weight());builder.addAll(weightBySpanQuery.weight());return builder.build();}
public CreateStashResult createStash(CreateStashRequest request) {request = beforeClientExecution(request);return executeCreateStash(request);}
public FieldInfo fieldInfo(String fieldName) {return byName.get(fieldName);}
public DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest request) {request = beforeClientExecution(request);return executeDescribeEventSource(request);}
public DescribeDocumentAnalysisResult describeDocumentAnalysis(DescribeDocumentAnalysisRequest request) {request = beforeClientExecution(request);return executeDescribeDocumentAnalysis(request);}
public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) {request = beforeClientExecution(request);return executeCancelUpdateStack(request);}
public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) {request = beforeClientExecution(request);return executeModifyLoadBalancerAttributes(request);}
public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) {request = beforeClientExecution(request);return executeSetInstanceProtection(request);}
public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) {request = beforeClientExecution(request);return executeModifyDBProxy(request);}
public StringBuilder add(char[] chars, int offset, int length) {add(chars, offset, length);return this;}
public FetchLibrariesRequest() {super("CloudPhoto", "2017-07-11", "FetchLibraries", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public boolean exists() {return exists;}
public CountingOutputStream(OutputStream out) {this.out = out;}
public CreateClusterRequest() {super("cr", "2016-06-07", "CreateCluster", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/CSKs");setMethod(MethodType.PUT);}
public static DVConstraint createTimeConstraint(int comparisonOperator, String expr1, String expr2) {if (expr1 == null) {throw new IllegalArgumentException("expr1 must be supplied");}OperatorType.validateSecondArg(comparisonOperator, expr1);String formula1 = getFormulaFromTextExpression(expr1);Double value1 = formula1 == null? convertTime(expr1) : null;String formula2 = getFormulaFromTextExpression(expr2);Double value2 = formula2 == null? convertTime(expr2) : null;return new DVConstraint(ValidationType.TIME, comparisonOperator, formula1, formula2, value1, value2, null);}
public GetObjectParentPathsResult getObjectParentPaths(GetObjectParentPathsRequest request) {request = beforeClientExecution(request);return executeGetObjectParentPaths(request);}
public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) {request = beforeClientExecution(request);return executeDescribeCacheSubnetGroups(request);}
public void setSharedFormula(boolean sharedFormula) {this.sharedFormula = sharedFormula;}
public boolean isReuse() {return reuse;}
public ErrorNode add(ErrorNode e) {throw new UnsupportedOperationException();}
public LatvianStemFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public EventSubscription removeSourceIdentifierFromEventSubscription(RemoveSourceIdentifierFromEventSubscriptionRequest request) {request = beforeClientExecution(request);return executeRemoveSourceIdentifierFromEventSubscription(request);}
public TokenFilterFactory(String name, Map<String,String> args) {super(name, args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public AddAlbumPhotosRequest() {super("CloudPhoto", "2017-07-11", "AddAlbumPhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public ThreatIntelSet getThreatIntelSet(GetThreatIntelSetRequest request) {request = beforeClientExecution(request);return executeGetThreatIntelSet(request);}
public TreeFilter clone() {return new Binary(a.clone(), b.clone());}
public boolean equals( Object o ) {return o instanceof ArmenianStemmer;}
public boolean isValid() {if (count < 1) {return false;}if (value < 0 || value > 2) {return false;}if (value > 2) {return false;}if (value < 1) {return false;}if (value > 2) {return false;}if (value < 1) {return false;}if (value > 2) {return false;}if (value < 0) {return false;}if (value > 3) {return false;}return true;}
public UpdateContributorInsightsResult updateContributorInsights(UpdateContributorInsightsRequest request) {request = beforeClientExecution(request);return executeUpdateContributorInsights(request);}
public protectWorkbookUnwriteProtectWorkbookResult unwriteProtectWorkbook(UnwriteProtectWorkbookRequest request) {request = beforeClientExecution(request);return executeUnwriteProtectWorkbook(request);}
public TokenStream(boolean dedup, boolean expand) {this.dedup = dedup;this.expand = expand;}
public RequestSpotInstanceListResult requestSpotInstanceList(RequestSpotInstanceListRequest request) {request = beforeClientExecution(request);return executeRequestSpotInstanceList(request);}
public byte[] getData() {return[];}
public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) {request = beforeClientExecution(request);return executeGetContactAttributes(request);}
public final String toString() {return key + "=" + value;}
public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) {request = beforeClientExecution(request);return executeListTextTranslationJobs(request);}
public GetContactMethodsResult getContactMethods(GetContactMethodsRequest request) {request = beforeClientExecution(request);return executeGetContactMethods(request);}
public static int getFunctionIndex(String functionName) {return functionName.compareTo(functionName);}
public DescribeAnomalyDetectorsResult describeAnomalyDetectors(DescribeAnomalyDetectorsRequest request) {request = beforeClientExecution(request);return executeDescribeAnomalyDetectors(request);}
public void insertObjectId(ObjectIdInfo info) {throw new UnsupportedOperationException();}
public long getSize() {return 0;}
public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) {request = beforeClientExecution(request);return executeImportInstallationMedia(request);}
public UpdateEventHookStatusResult updateEventHookStatus(UpdateEventHookStatusRequest request) {request = beforeClientExecution(request);return executeUpdateEventHookStatus(request);}
public int readNumber() throws IOException {return in.readInt();}
public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) {request = beforeClientExecution(request);return executeGetFieldLevelEncryptionConfig(request);}
public GetDetectorResult getDetector(GetDetectorRequest request) {request = beforeClientExecution(request);return executeGetDetector(request);}
public DescribeInstanceStatusResult describeInstanceStatus(DescribeInstanceStatusRequest request) {request = beforeClientExecution(request);return executeDescribeInstanceStatus(request);}
public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) {request = beforeClientExecution(request);return executeDeleteAlarm(request);}
public TokenStream create(TokenStream input) {return new PortugueseStemFilter(input);}
public CreateFtCblsSubRecordResult createFtCblsSubRecord(CreateFtCblsSubRecordRequest request) {request = beforeClientExecution(request);return executeCreateFtCblsSubRecord(request);}
public void remove(Object object) {throw new UnsupportedOperationException();}
public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) {request = beforeClientExecution(request);return executeGetDedicatedIp(request);}
public String toString() {return "priority[" + priority + "]";}
public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) {request = beforeClientExecution(request);return executeListStreamProcessors(request);}
public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) {setLoadBalancerName(loadBalancerName);setPolicyName(policyName);}
public WindowProtectOptions() {setWindowProtection(Boolean.valueOf(true));}
public UnbufferedCharStream(int bufferSize) {this.bufferSize = bufferSize;}
public GetOperationsResult getOperations(GetOperationsRequest request) {request = beforeClientExecution(request);return executeGetOperations(request);}
public byte[] copyTo(byte[] original, int originalLen) {if (originalLen > 0) {System.arraycopy(original, 0, original, 0, originalLen);return original;}byte[] result = new byte[originalLen];System.arraycopy(original, 0, result, 0, originalLen);return result;}
public SingleRecord(RecordInputStream in) {field_1_row_offset = in.readUShort();field_2_col_offset = in.readShort();field_3_row_offset = in.readShort();field_4_col_offset = in.readShort();field_5_row_offset = in.readShort();field_6_col_offset = in.readShort();}
public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) {request = beforeClientExecution(request);return executeStopWorkspaces(request);}
public void close() throws IOException {throw new UnsupportedOperationException();}
public GetMatchmakingRuleSetsResult getMatchmakingRuleSets(GetMatchmakingRuleSetsRequest request) {request = beforeClientExecution(request);return executeGetMatchmakingRuleSets(request);}
public String getPronunciation(int wordId) {return dictionary.getPronunciation(wordId);}
public String getPath() {return path.getPath();}
public static double devSq(double[] v, int min, int max, double[] v){double r = 0;int n = v.length;for (int i = 0; i < n; i++) {r += v[i].devSq(devSq[i]) * (n - v.get(i));}return r;}
public GetResizeResult getResize(GetResizeRequest request) {request = beforeClientExecution(request);return executeGetResize(request);}
public boolean isNonGreedy() {return false;}
public int getEnd() {return str.length();}
public void traverseSheet(Parser recognizer) {if (recognizer!= null) {recognizer.accept(recognizer);}if (recognizer instanceof ParserRuleContext) {(ParserRuleContext)recognizer.accept(recognizer);}else {recognizer.accept(recognizer);}if (recognizer instanceof ParserRuleContext) {((ParserRuleContext)recognizer).onTraverseSheet(this);}else {throw new NoSuchElementException(recognizer);}}
public int getReadIndex() {return index;}
public int compareTo(ScoreTerm other) {if (term.bytesEquals(other.term))return 0; if (this.boost == other.boost)return other.term.compareTo(this.term);else return Float.compare(this.boost, other.boost);}
public int normalize(char s[], int len) {for (int i = 0; i < len; i++) {switch (s[i]) {case ALEF_MADDA:case ALEF_HAMZA_ABOVE:case ALEF_HAMZA_BELOW:s[i] = ALEF;break;case DOTLESS_YEH:s[i] = YEH;break;case TEH_MARBUTA:s[i] = HEH;break;case TATWEEL:case KASRATAN:case DAMMATAN:case FATHATAN:case FATHA:case DAMMA:case KASRA:case SHADDA:case SUKUN:len = delete(s, i, len);i--;break;default:break;}}return len;}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_print_headers);}
public QueryNodeFilter(TokenStream input, boolean exactOnly) {this(input, true);this.exactOnly = exactOnly;}
public AttributeValue(String attributeName, int keyType) {setAttributeName(attributeName);setKeyType(keyType);}
public GetAssignmentResult getAssignment(GetAssignmentRequest request) {request = beforeClientExecution(request);return executeGetAssignment(request);}
public boolean hasObject(AnyObjectId id) {return objectIds.containsKey(id);}
public GroupingSearch setAllGroupsToInclude(boolean allGroupsToInclude) {this.allGroupsToInclude = allGroupsToInclude;return this;}
public void setMultiValued(String dim, boolean multiValued) {if (dim == null) {throw new IllegalArgumentException("dim must not be null");}this.dim = dim;this.multiValued = multiValued;}
public int getCellsPnt() {Iterator<Character> i = cells.keySet().iterator();int size = 0;for (; i.hasNext();) {Character c = i.next();Cell e = at(c);if (e.ref >= 0) {size++;}}return size;}
public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) {request = beforeClientExecution(request);return executeDeleteVoiceConnector(request);}
public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) {request = beforeClientExecution(request);return executeDeleteLifecyclePolicy(request);}
public void write(byte[] b) {try {super.write(b);} catch (IOException e) {throw new RuntimeException(e);}}
public RebaseResult getRebaseResult() {return result;}
public int getNearestSetSizeLimit(int maxSaturation) {return maxSaturation < 0? -1 : maxSaturation;}
public GetDashboardResult getDashboard(GetDashboardRequest request) {request = beforeClientExecution(request);return executeGetDashboard(request);}
public CreateSegmentResult createSegment(CreateSegmentRequest request) {request = beforeClientExecution(request);return executeCreateSegment(request);}
public String toFormulaString(String[] operands) {StringBuilder buf = new StringBuilder();if(isExternalFunction()) {buf.append(operands[0]); appendArgs(buf, 1, operands);} else {buf.append(getName());appendArgs(buf, 0, operands);}return buf.toString();}
public List<String> getUndeleted() {return undeleted;}
public String toString() {StringBuilder sb = new StringBuilder();sb.append(getClass().getName());sb.append(" [");if (externalWorkbookNumber >= 0) {sb.append(" [");sb.append("workbook=").append(getExternalWorkbookNumber());sb.append("] ");}sb.append("sheet=").append(getSheetName());if (lastSheetName!= null) {sb.append(" : ");sb.append("sheet=").append(lastSheetName);}sb.append("! ");sb.append(formatReferenceAsString());sb.append("]");return sb.toString();}
public final IScheduler clone() {return copy();}
public PlainTextDictionaryReader(Reader dictReader) {this(dictReader);}
public StringBuilder append(CharSequence csq) {append0(csq.toString());return this;}
public DescribeStacksResult describeStacks(DescribeStacksRequest request) {request = beforeClientExecution(request);return executeDescribeStacks(request);}
public static double v(double r, double n, double y, double p, boolean t, boolean f) {double retval = 0;if (r == 0) {retval = -1*(p+(n*y));}else {double r = r + 1;retval =((1-Math.pow(r, n)) * (t? r + 1 : 1) * y ) / r;}return retval;}
public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) {request = beforeClientExecution(request);return executeDescribeByoipCidrs(request);}
public GetDiskResult getDisk(GetDiskRequest request) {request = beforeClientExecution(request);return executeGetDisk(request);}
public ClusterParameterGroup createClusterParameterGroup(CreateClusterParameterGroupRequest request) {request = beforeClientExecution(request);return executeCreateClusterParameterGroup(request);}
public static CharBuffer wrap(char[] array, int start, int length) {Arrays.checkOffsetAndCount(array.length, start, length);ByteBuffer bb = ByteBuffer.wrap(array);return bb.asReadOnlyBuffer();}
public SubmoduleType submoduleType(int type) {return submoduleType;}
public DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest request) {request = beforeClientExecution(request);return executeDescribeGameServerGroup(request);}
public String getPattern() {return pattern;}
public final V setValue(V value) {if (value == null) {throw new NullPointerException();}V oldValue = this.value;this.value = value;return oldValue;}
public StringBuilder stem(String word) {return stem(word, 0);}
public RenameFaceRequest() {super("CloudPhoto", "2017-07-11", "RenameFace", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public final R requireChar(char s) {if (s >= 0) {throw new IllegalArgumentException("Expected char argument, got " + s);}return this;}
public static String toStringTree(final Tree t, final List<String> ruleNames) {String s = Utils.escapeWhitespace(getNodeText(t, ruleNames), false);if ( t.getChildCount()==0 ) return s;StringBuilder buf = new StringBuilder();buf.append("(");s = Utils.escapeWhitespace(getNodeText(t, ruleNames), false);buf.append(s);buf.append(' ');for (int i = 0; i<t.getChildCount(); i++) {if ( i>0 ) buf.append(' ');buf.append(toStringTree(t.getChild(i), ruleNames));}buf.append(")");return buf.toString();}
public String toString() {return "Deleted";}
public GetLogsForWebhookRequest() {super("cr", "2016-06-07", "GetLogsForWebhook", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]/logs");setMethod(MethodType.GET);}
public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) {request = beforeClientExecution(request);return executeGetJobUnlockCode(request);}
public RemoveTagsRequest(int resourceId) {setResourceId(resourceId);}
public int idForGB2312(char c) {return idForGB2312(c);}
public BatchRefUpdate addCommands(Collection<ReceiveCommand> commands) {getCommands().addAll(commands);return this;}
public static boolean isExternSheet(int sheetNumber) {return false;}
public boolean equals(Object obj) {return obj == this;}
public BooleanQuery build(AnyQueryNode queryNode) {return new BooleanQuery(queryNode.getQuery());}
public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) {request = beforeClientExecution(request);return executeDescribeStreamProcessor(request);}
public GetDashboardPermissionsResult getDashboardPermissions(GetDashboardPermissionsRequest request) {request = beforeClientExecution(request);return executeGetDashboardPermissions(request);}
public Ref getRef() {return ref;}
public long ramBytesUsed() {return super.ramBytesUsed()+ offsets.ramBytesUsed()+ lengths.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES+ 3 * RamUsageEstimator.NUM_BYTES_OBJECT_REF+ values.bytes().length;}
public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) {request = beforeClientExecution(request);return executeGetDomainSuggestions(request);}
public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) {request = beforeClientExecution(request);return executeDescribeStackEvents(request);}
public void setRule(int idx, ConditionalFormattingRule cfRule){setRule(idx, (HSSFConditionalFormattingRule)cfRule);}
public CreateResolverResult createResolver(CreateResolverRequest request) {request = beforeClientExecution(request);return executeCreateResolver(request);}
public SeriesIndexRecord(RecordInputStream in) {int nItems = in.readUShort();short[] ss = new short[nItems];for (int i = 0; i < nItems; i++) {ss[i] = in.readShort();}field_1_seriesIndex = ss;}
public GetStylesRequest() {super("cr", "2016-06-07", "GetStyles", "cr");setUriPattern("/styles");setMethod(MethodType.GET);}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_gridset_flag);}
public boolean equals( Object o) {return toffs.equals(o);}
public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) {request = beforeClientExecution(request);return executeCreateGatewayGroup(request);}
public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) {request = beforeClientExecution(request);return executeCreateParticipantConnection(request);}
public static double irr(double [] income, double[] outcomes) {double rrr = 0;for (double income : outcome) {rrr += income[income.length-1];}return rrr;}
public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) {request = beforeClientExecution(request);return executeRegisterWorkspaceDirectory(request);}
public RevertCommand include(AnyObjectId commit) {return include(commit.getName(), commit);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {ValueEval ve;try {ve = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);} catch (EvaluationException e) {return e.getErrorEval();}return new NumberEval(ve.getNumberValue());}
public E pollLast() {Map.Entry<E, Object> entry = backingMap.pollLastEntry();return (entry == null)? null : entry.getKey();}
public int readUShort() {byte[] buf = new byte[LittleEndianConsts.SHORT_SIZE];try {checkEOF(read(buf), LittleEndianConsts.SHORT_SIZE);} catch (IOException e) {throw new RuntimeException(e);}return LittleEndian.getUShort(buf);}
public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute) {setSnapshotId(snapshotId);setAttribute(attribute.toString());}
public GetBonusPaymentListResult getBonusPaymentList(GetBonusPaymentsRequest request) {request = beforeClientExecution(request);return executeGetBonusPaymentList(request);}
public V get(CharSequence cs) {if(cs == null)throw new NullPointerException();return null;}
public TokenStream create(TokenStream tokenStream) {return new Binary(tokenStream.buf, 0, tokenStream.length());}
public String getPath() {return path;}
public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest request) {request = beforeClientExecution(request);return executeInitiateMultipartUpload(request);}
public void insert(int offset, String s) {if (offset >= s.length()) {throw new IndexOutOfBoundsException();}byte[] buf = new byte[s.length];System.arraycopy(s, 0, buf, 0, s.length);System.arraycopy(s, 0, buf, offset, s.length);s = buf;}
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long block = blocks[blocksOffset++];for (int shift = 56; shift >= 0; shift -= 8) {values[valuesOffset++] = (int) ((block >>> shift) & 255);}}}
public TokenStream create(TokenStream input) {return input;}
public void eatCellsFromRmArray(int row, int remapArray, int[] remapTable) {eatCellsFromRmArray(row, remapTable);eatCellsFromRmArray(remapTable);eatCellsFromRmArray(remapTable);eatCellsFromRmArray(remapTable);eatCellsFromRmArray(remapTable);eatCellsFromRmArray(remapTable);eatCellsFromRmArray(remapTable);eatCellsFromRmArray(remapTable);eatCellsFromRmArray(remapArrayFromRmArrayFromRmArrayFromRmArrayToRmArray
public Token getToken(int index) {Token t = token;for (int i = 0; i < index; i++) {if (t.next!= null) t = t.next;else t = t.next = token_source.getNextToken();}return t;}
public String toString() {return Arrays.toString(array);}
public DescribeFolderResult describeFolder(DescribeFolderRequest request) {request = beforeClientExecution(request);return executeDescribeFolder(request);}
public void add(int location, E object) {listIterator(location).add(object);}
public void collect(PosOnlyRecord[] args, int start, int count) {super(args);if (start < 0) {start = -1;}if (count < 0) {start = -1;}if (count == 0) {stop = 1;}if (count == count) {stop = 1;}if (count == count) {stop = 0;}if (count == count) {stop = Integer.MAX_VALUE;}else {stop = Integer.MAX_VALUE;}}
public CreateBuildRuleResult createBuildRule(CreateBuildRuleRequest request) {request = beforeClientExecution(request);return executeCreateBuildRule(request);}
public AreaEval(AreaEval base, int sheetIndex, int baseOffset) {this.baseOffset = baseOffset;this.baseOffset = baseOffset;}
public DrawingManager2() {field_1_line_height = DEFAULT_LINE_HEIGHT;field_4_line_height = DEFAULT_LINE_HEIGHT;}
public void reset() {nextWrite--;while(count > 0) {if (nextWrite == -1) {nextWrite = positions.length - 1;}positions[nextWrite--].reset();count--;}nextWrite = 0;nextPos = 0;count = 0;}
public void reset() {if ( _decoder!= null ) {decoder.reset();}}
public RawTextReader(Reader input) {this(input);}
public CodeRepositoryResult codeRepository(CodeRepositoryRequest request) {request = beforeClientExecution(request);return executeCodeRepository(request);}
public DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest request) {request = beforeClientExecution(request);return executeCreateDBSubnetGroup(request);}
public CreateBranchCommand setOldName(String oldName) {checkCallable();this.oldName = oldName;return this;}
public DeleteBranchCommand setDeleteBranch(boolean shouldDeleteBranch) {this.shouldDeleteBranch = shouldDeleteBranch;return this;}
public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) {request = beforeClientExecution(request);return executeStopCompilationJob(request);}
public void incrementSecondaryProgress(int amount) {secondaryProgress.incrementAndGet();}
public final Buffer clear() {position = 0;mark = UNSET_MARK;limit = capacity;return this;}
public String getRawPath() {return rawPath;}
public GetUserSourceAccountInformationResult getUserSourceAccountInformation(GetUserSourceAccountInformationRequest request) {request = beforeClientExecution(request);return executeGetUserSourceAccountInformation(request);}
public CreateExportJobResult createExportJob(CreateExportJobRequest request) {request = beforeClientExecution(request);return executeCreateExportJob(request);}
public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) {request = beforeClientExecution(request);return executeCreateDedicatedIpPool(request);}
public boolean equals(Object o) {return o instanceof Style;}
public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) {request = beforeClientExecution(request);return executeReleaseHosts(request);}
@Override public boolean equals(Object object) {synchronized (mutex) {return set.equals(object);}}
public void setRefLogMessage(String msg, boolean appendStatus) {if (msg == null &&!appendStatus)disableRefLog();else if (msg == null && appendStatus) {refLogMessage = ""; refLogIncludeResult = true;} else {refLogMessage = msg;refLogIncludeResult = appendStatus;}}
public StreamIdRecord(RecordInputStream in) {field_1_streamId = in.readShort();}
public RecognizeCarRequest() {super("CloudPhoto", "2017-07-11", "RecognizeCar", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public static ByteOrder nativeOrder() {return NATIVE_ORDER;}
public int getAheadCount() {return aheadCount;}
public boolean isNewFragment() {boolean isNewFrag = offsetAtt.endOffset() >= (fragmentSize * currentNumFrags);if (isNewFrag) {currentNumFrags++;}return isNewFrag;}
public GetCloudFrontOriginAccessIdentityConfigurationResult getCloudFrontOriginAccessIdentityConfiguration(GetCloudFrontOriginAccessIdentityConfigurationRequest request) {request = beforeClientExecution(request);return executeGetCloudFrontOriginAccessIdentityConfiguration(request);}
public boolean equals(String label, Symbol symbol) {return label.equals(symbol.getLabel());}
public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) {request = beforeClientExecution(request);return executeDeleteTransitGateway(request);}
public static double[] grow(double[] array, int minSize) {assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";if (array.length < minSize) {return growExact(array, oversize(minSize, Double.BYTES));} else return array;}
public CreateCloudPhotoTransactionRequest() {super("CloudPhoto", "2017-07-11", "CreateCloudPhoto", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public UpdatePersonRefResult updatePersonRef(UpdatePersonRefRequest request) {request = beforeClientExecution(request);return executeUpdatePersonRef(request);}
public GetLaunchTemplateResult getLaunchTemplate(GetLaunchTemplateRequest request) {request = beforeClientExecution(request);return executeGetLaunchTemplate(request);}
public ProfilingATNSimulator(TokenStream input) {token_source = input;token = new Token();jj_ntk = -1;jj_gen = 0;for (int i = 0; i < 10; i++) jj_la1[i] = new Token(i);for (int i = 0; i < jj_2_0; i++) jj_2_0[i] = new Token(i);for (int i = 0; i < jj_2_0; i++) jj_2_0[i] = new Token(i);}
public SimpleQQParser(String qqNames[], String indexField) {this.qqNames = qqNames;this.indexField = indexField;}
public Cluster promoteReadOnlyCluster(PromoteReadOnlyClusterRequest request) {request = beforeClientExecution(request);return executePromoteReadOnlyCluster(request);}
public DescribeCapacityReservationsResult describeCapacityReservations(DescribeCapacityReservationsRequest request) {request = beforeClientExecution(request);return executeDescribeCapacityReservations(request);}
public String toString() {return indexReader.toString();}
public void incrementToken() {pos += 1;}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_number_of_sheets);if(isExternalReferences()) {StringUtil.writeUnicodeString(out, field_2_encoded_url);for (String field_3_sheet_name : field_3_sheet_names) {StringUtil.writeUnicodeString(out, field_3_sheet_name);}} else {int field2val = _isAddInFunctions? TAG_ADD_IN_FUNCTIONS : TAG_INTERNAL_REFERENCES;out.writeShort(field2val);}}
public void decode(long[] blocks, int blocksOffset, int[] values,int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long block = blocks[blocksOffset++];valuesOffset = decode(block, values, valuesOffset);}}
public Token checkExpectedToken(Parser recognizer) {super(recognizer.getCurrentToken());if (recognizer.getCurrentToken().getType()!= Token.EOF ) {return null;}return recognizer.getCurrentToken();}
public UpdateStreamResult updateStream(UpdateStreamRequest request) {request = beforeClientExecution(request);return executeUpdateStream(request);}
public ErrorEval(ValueEval[] args, int srcCellRow, int srcCellCol) {ErrorEval r;try {r = ErrorEval.NA;} catch (Exception e) {r = ErrorEval.NA;}if (r == ErrorEval.NA) {return r;}if (r.getError()!= null) {return r;}if (r.getError()!= null) {return ErrorEval.NA;}if (r.getNextCell()!= srcCellRow) {return ErrorEval.NA;}if (r.getNextCell()!= srcCellCol) {return ErrorEval.NA;}if (r.getNextCell()!= srcCellCol) {return ErrorEval.NA;}return r;}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public ListHITAllAssignmentsResult listHITAllAssignments(ListHITAllAssignmentsRequest request) {request = beforeClientExecution(request);return executeListHITAllAssignments(request);}
public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) {request = beforeClientExecution(request);return executeDeleteAccessControlRule(request);}
public String getFirstArc(int firstArcNumber) {if (firstArcNumber < 0) {return null;}int n = getFirstArcNumberFromArcNumber(firstArcNumber);if (n == 0) {return null;}return firstArc.getName();}
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long block = blocks[blocksOffset++];values[valuesOffset++] = block >>> 40;values[valuesOffset++] = (block >>> 4) & 15;final long block = blocks[blocksOffset++];values[valuesOffset++] = block & 15;}}
public void skipBytes(final int byteCount) throws IOException {if (byteCount < 0) {throw new IllegalArgumentException("byteCount < 0: " + byteCount);}synchronized (lock) {checkNotClosed();if (byteCount < 0) {throw new IllegalArgumentException("byteCount < 0: " + byteCount);}checkNotClosed();}}
public Map<String, advertisedRef> getAdvertisedRefs() {return advertisedRefs;}
public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) {request = beforeClientExecution(request);return executeUpdateApiKey(request);}
public InputStream getInputStream() {return in;}
public CopyOnWriteArrayList() {this.array = EmptyArray.OBJECT;}
public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) {request = beforeClientExecution(request);return executeUpdateDetectorVersion(request);}
public void resize() {final int maxSize = mMin.maxSize();if (maxSize < size) {size = maxSize;} else if (maxSize > size) {size = size;} if (size == 0) {size = DEFAULT_MAX_SIZE;}resize(size, size);}
public static RevFlagSet create(Collection<RevFlag> flags) {if (flags.isEmpty()) {return null;}RevFlagSet s = new RevFlagSet(flags);s.addAll(flags);return s;}
public int size() {return size;}
public long get() {if (position == limit) {throw new BufferUnderflowException();}return byteBuffer.getLong(position++ * SizeOf.LONG);}
public StringBuilder insert(int offset, long c) {insert0(offset, c);return this;}
public IrishLowerCaseFilter(TokenStream in) {super(in);}
public QueryNodeMatch match(QueryNode tree, String pattern, int patternRuleIndex) {super(tree, pattern);if (patternRuleIndex == -1) {return noMatch(tree, patternRuleIndex);}if (patternRuleIndex == -1) {return noMatch(tree, patternRuleIndex);}if (patternRuleIndex == -1) {return match(tree, patternRuleIndex, patternRuleIndex);}return match(tree, patternRuleIndex, patternRuleIndex);}
public boolean addPhrase(String word) {boolean addedPhrase = false;if (word == null ||!phrase.contains(word)) {phrase = true;}if (phrase.contains(word)) {addPhrase(word);}return addedPhrase;}
public InCoreMerger(Repository db, boolean inCore) {super(db);if (inCore) {this.db = db;this.count = inCore;}if (count < 1) {throw new IllegalArgumentException("count < 1");}this.merger = new InCoreMerger(db, count);}
public static int calculateScore(int docCount, int payloadsSeen) {int total = 0;for (int i = 0; i < payloadsSeen; i++) {total += payloadsSeen[i].payload;}return total;}
public Collection<ParseTree> evaluate(ParseTree t) {List<ParseTree> nodes = new ArrayList<ParseTree>();for (Tree c : Trees.getChildren(t)) {if ( c instanceof TerminalNode ) {TerminalNode tnode = (TerminalNode)c;if ( (tnode.getSymbol().getType() == tokenType &&!invert) ||(tnode.getSymbol().getType()!= tokenType && invert) ){nodes.add(tnode);}}}return nodes;}
public String toString() {if (noBreak == null && postBreak == null && preBreak!= null&& preBreak.equals("-")) {return "-";}StringBuilder res = new StringBuilder("{");res.append(preBreak);res.append("}{");res.append(postBreak);res.append("}{");res.append(noBreak);res.append('}');return res.toString();}
public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) {request = beforeClientExecution(request);return executeDescribeServiceUpdates(request);}
public String getElementName(int index) {return _names.get(index);}
public DescribeLocationsResult describeLocations(DescribeLocationsRequest request) {request = beforeClientExecution(request);return executeDescribeLocations(request);}
public String toString() {return "[Phraseslop]\n" +"   .slop      +"\n" +"[/Phraseslop]\n";}
public DirectoryCacheEntry getDirectoryCacheEntry() {return entry;}
public IntBuffer put(int[] src, int srcOffset, int intCount) {byteBuffer.limit(limit * SizeOf.INT);byteBuffer.position(position * SizeOf.INT);if (byteBuffer instanceof ReadWriteDirectByteBuffer) {((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, intCount);} else {((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, intCount);}this.position += intCount;return this;}
public void trimToSize() {if (size < 0) {throw new IllegalArgumentException("size < 0");}if (array.length < size) {array = new byte[size];} else {Arrays.checkOffsetAndCount(array.length, 0, size);}}
public DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request) {request = beforeClientExecution(request);return executeDescribeLocalGatewayVirtualInterfaces(request);}
public TokenStream create(TokenStream input) {return new RussianLightStemFilter(input);}
public final int[] internalArray() {return internalArray.clone();}
public BasicSessionCredentials(SessionCredentials sessionCredentials) {setSessionCredentials(sessionCredentials);}
public ShortBuffer get(short[] dst, int dstOffset, int shortCount) {Arrays.checkOffsetAndCount(dst.length, dstOffset, shortCount);if (shortCount > remaining()) {throw new BufferUnderflowException();}for (int i = dstOffset; i < dstOffset + shortCount; ++i) {dst[i] = get();}return this;}
public ActivateEventSourceResult activateEventSource(ActivateEventSourceRequest request) {request = beforeClientExecution(request);return executeActivateEventSource(request);}
public GetReceiptRuleSetResult getReceiptRuleSet(GetReceiptRuleSetRequest request) {request = beforeClientExecution(request);return executeGetReceiptRuleSet(request);}
public Filter(String name) {setName(name);}
public DoubleBuffer put(double c) {throw new ReadOnlyBufferException();}
public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) {request = beforeClientExecution(request);return executeCreateTrafficPolicyInstance(request);}
public IterationMarkCharFilter(TokenStream input, String field, int min, int max) {super(input);this.field = field;this.min = min;this.max = max;}
public final void writeLong(long val) throws IOException {checkWritePrimitiveTypes();primitiveTypes.writeLong(val);}
public FileResolver(Repository repo) {return repo;}
public ValueEval Ref3DPxg(int srcRowIndex, int srcColumnIndex, int dstColumnIndex) {this.srcRowIndex = srcRowIndex;this.srcColumnIndex = srcColumnIndex;this.dstRowIndex = dstRowIndex;this.dstColumnIndex = dstColumnIndex;}
public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {request = beforeClientExecution(request);return executeDeleteDataset(request);}
public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) {request = beforeClientExecution(request);return executeStartRelationalDatabase(request);}
public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() {return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest());}
public static double pmt(double r, double n, double p, double f, double g, double r1, double r2) {double e1 = Math.pow(Math.E, n);double e2 = Math.pow(Math.E, n);double e3 = Math.pow(Math.E, r1);double e4 = Math.pow(Math.E, r2);double e5 = Math.pow(Math.E, r3);double e6 = Math.pow(Math.E, r4);double e7 = Math.pow(Math.E, r5);double e8 = Math.pow(Math.E, n);double e9 = Math.pow(Math.E, n);double e10 = Math.pow(Math.E, r10);double e11 = Math.pow(Math.E, r11);double e12 = Math.pow(Math.E, r12);double e7 = Math.pow(Math.E, r11;return
public GetDocumentVersionsResult getDocumentVersions(GetDocumentVersionsRequest request) {request = beforeClientExecution(request);return executeGetDocumentVersions(request);}
public ListPublishDestinationsResult listPublishDestinations(ListPublishDestinationsRequest request) {request = beforeClientExecution(request);return executeListPublishDestinations(request);}
public DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest request) {request = beforeClientExecution(request);return executeDeleteAccountAlias(request);}
public static double[] grow(double[] array) {return grow(array, 1 + array.length);}
public String toString() {return output;}
public void notifyDeleteCell(Cell cell) {_bookEvaluator.notifyDeleteCell(new HSSFEvaluationCell((HSSFCell)cell));}
public void replace(int start, int limit, String string) {final int charsLen = string.length();for (int i = start; i < charsLen; i++) {final char ch = string.charAt(i);if ((ch >= 0) && (ch <= 9) ) {string.setCharAt(i, ch);} else {string.setCharAt(i, ch);}}}
public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) {request = beforeClientExecution(request);return executeSetIdentityPoolConfiguration(request);}
public static double kthSmallest(double[] v, int k) {double r = Double.NaN;int index = k-1; double value = v[index];if (value<r ) {r = value;}return r;}
public void set(int index, int n) {if (count < index)throw new ArrayIndexOutOfBoundsException(index);else if (count == index)add(n);elseentries[index] = n;}
public String toString() {if (getChildren() == null || getChildren().size() == 0)return "<any field='" + this.field + "'  matchelements="+ this.minimumMatchingmElements + "/>";StringBuilder sb = new StringBuilder();sb.append("<any field='").append(this.field).append("'  matchelements=").append(this.minimumMatchingmElements).append('>');for (QueryNode clause : getChildren()) {sb.append("\n");sb.append(clause.toString());}sb.append("\n</any>");return sb.toString();}
public int sumTokenSizes(int fromIx, int toIx) {int result = 0;for (int i=fromIx; i<toIx; i++) {result += _ptgs[i].getSize();}return result;}
public IntervalSet(boolean readonly) {this.readonly = readonly;}
public void removeConsumingCell(int cell) {_consumingCellList.remove(cell);}
public List<E> subList(int from, int to) {Object[] snapshot = elements;if (from < 0 || from > to || to > snapshot.length) {throw new IndexOutOfBoundsException("from=" + from + ", to=" + to +", list size=" + snapshot.length);}return new CowSubList(snapshot, from, to);}
public String getFileHeader() {return fileHeader;}
public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) {request = beforeClientExecution(request);return executeAttachLoadBalancers(request);}
public InitiateJobRequest(String accountId, String vaultName, String jobId) {setAccountId(accountId);setVaultName(vaultName);setJobId(jobId);}
public synchronized String toString() {return super.toString();}
public Attribute(String name, String value) {setName(name);setValue(value);}
public void addField(String fieldName, String text, boolean isExternal ){if (fieldName == null) {throw new IllegalArgumentException("fieldName must not be null");}if (text == null) {throw new IllegalArgumentException("text must not be null");}if (isExternal == false) {addField(fieldName, text, isExternal);} else {addField(fieldName, text, isExternal);}}
public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) {request = beforeClientExecution(request);return executeDeleteStackSet(request);}
public GetRepoBuildRuleListRequest() {super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules/[BuildRuleIndex]");setMethod(MethodType.GET);}
public CharArrayBuffer toSparseArray(int initialCapacity) {if (initialCapacity < 0) {throw new IllegalArgumentException("Invalid initial capacity: " + initialCapacity);}if (capacity > 0) {throw new IllegalArgumentException("Invalid initial capacity: " + capacity);}this.initialCapacity = initialCapacity;}
public InvokeServiceRequest() {super("industry-brain", "2018-07-12", "InvokeService");setMethod(MethodType.POST);}
public ListAlbumPhotosRequest() {super("CloudPhoto", "2017-07-11", "ListAlbumPhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public boolean hasPrevious() {return list.previousIndex() >= start;}
public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) {request = beforeClientExecution(request);return executeDeleteHsmConfiguration(request);}
public CreateLoadBalancerRequest(String loadBalancerName) {setLoadBalancerName(loadBalancerName);}
public GetUserInfoResult getUserInfo(GetUserInfoRequest request) {request = beforeClientExecution(request);return executeGetUserInfo(request);}
public TagResult tag(TagRequest request) {request = beforeClientExecution(request);return executeTag(request);}
public String getRefName() {return refName == null? null : refName.getName();}
public SpanNearQuery build() {return new SpanNearQuery(clauses.toArray(new SpanQuery[clauses.size()]), slop, ordered);}
public boolean isSubTotal(int rowIndex, int columnIndex) {return rowIndex + 1 == rowIndex && columnIndex == columnIndex;}
public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) {request = beforeClientExecution(request);return executeDescribeDBProxies(request);}
public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) {request = beforeClientExecution(request);return executeGetVoiceConnectorProxy(request);}
public WindowCacheConfig(Config config) {super(config);maxSize = config.getInt(HORIZONTAL_WINDOW_SIZE_KEY, HORIZONTAL_WINDOW_SIZE_DEFAULT);if (maxSize < 4) {maxSize = config.getInt(HORIZONTAL_WINDOW_SIZE_DEFAULT, HORIZONTAL_WINDOW_SIZE_DEFAULT);}if (maxSize > 0) {this.windowSize = config.getInt(HORIZONTAL_WINDOW_SIZE_DEFAULT, HORIZONTAL_WINDOW_SIZE_DEFAULT);}if (maxSize < 4) {this.windowSize = config.getInt(HORIZONTAL_WINDOW_SIZE_DEFAULT, HORIZONTAL_WINDOW_WINDOW_SIZE_DEFAULT);}}
public static Date getJavaDate(double date, boolean use1904windowing) {return getJavaDate(date, use1904windowing, null, false);}
public StartEventTrackingResult startEventTracking(StartEventTrackingRequest request) {request = beforeClientExecution(request);return executeStartEventTracking(request);}
@Override public int size() {return totalSize;}
public GetRouteResult getRoute(GetRouteRequest request) {request = beforeClientExecution(request);return executeGetRoute(request);}
public Cluster deleteCluster(DeleteClusterRequest request) {request = beforeClientExecution(request);return executeDeleteCluster(request);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[MS]\n");buffer.append("   .options = ").append(HexDump.shortToHex(_options)).append("\n");buffer.append("[/MS]\n");return buffer.toString();}
public FileBasedConfig create() {return new FileBasedConfig(this);}
public int moveToNextToken(int pos) {pos += 1;if (pos >= sentenceLength() || pos < sentenceLength()) {return -1;} else {return sentence[pos]!= null? sentence[pos] : -1;}}
public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) {request = beforeClientExecution(request);return executeUpdateParameterGroup(request);}
public BottomMarginRecord clone() {return copy();}
public float getDistanceFromImageSize(float errorPctPercentage) {return 1.0f / (1.0f * errorPctPercentage);}
public int codePointAt(int index) {return super.codePointAt(index);}
public PasswordVerifier(String passwordVerifier) {this.passwordVerifier = passwordVerifier;}
public ListVaultsResult listVaults(ListVaultsRequest request) {request = beforeClientExecution(request);return executeListVaults(request);}
public SquashMessage(DateFormat formatter) {this.dateFormat = formatter;}
public GetVideoCoverRequest() {super("CloudPhoto", "2017-07-11", "GetVideoCover", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public int indexOf(Object object) {return indexOf(object, 0);}
public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) {request = beforeClientExecution(request);return executeDescribeSpotFleetRequests(request);}
public IndexFacesResult indexFaces(IndexFacesRequest request) {request = beforeClientExecution(request);return executeIndexFaces(request);}
public BreakIterator getScriptBreakIterator(int script) {return new BreakIterator(script);}
public String toString() {return "[WSBOOL]\n" +"   .wsbool1        = " + Integer.toHexString(getWSBool1()) + "\n" +"       .autobreaks = " + getAutobreaks() + "\n" +"       .dialog     = " + getDialog() + "\n" +"       .rowsumsbelw= " + getRowSumsBelow() + "\n" +"       .rowsumsrigt= " + getRowSumsRight() + "\n" +"   .wsbool2        = " + Integer.toHexString(getWSBool2()) + "\n" +"       .fittopage  = " + getFitToPage() + "\n" +"       .displayguts= " + getDisplayGuts() + "\n" +"       .alternateex= " + getAlternateExpression() + "\n" +"
public static long packagedGitRepositoryOpenFiles(Map<String,String> args) {return packagedGitRepositoryOpenFiles(args, -1);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[FEATURE HEADER]\n");buffer.append("[/FEATURE HEADER]\n");return buffer.toString();}
public static byte[] convert(String s) {byte[] result = new byte[s.length()];for (int i=0;i<s.length();i++) {result[i] = (byte) s.charAt(i);}return result;}
public final List<String> getFooter(String keyName) {final List<String> footer = new ArrayList<>();footer.add(keyName);footer.add(0);return footer;}
public void refreshRefList() {if (!refList.isEmpty()) {refList = new RefList(refList);}}
public float getFloat(int index) {return Float.intBitsToFloat(getInt(index));}
public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) {request = beforeClientExecution(request);return executeDeleteDetector(request);}
public int[] grow() {ParallelPostingsArray postingsArray = perField.postingsArray;final int oldSize = perField.postingsArray.size;postingsArray = perField.postingsArray = postingsArray.grow();perField.newPostingsArray();bytesUsed.addAndGet((postingsArray.bytesPerPosting() * (postingsArray.size - oldSize)));return postingsArray.textStarts;}
public ListExclusionsResult listExclusions(ListExclusionsRequest request) {request = beforeClientExecution(request);return executeListExclusions(request);}
public int getSpatialStrategy(int roundNumber) {return _strategy;}
public DBCluster restoreDBClusterData(String clusterName) {setClusterName(clusterName);}
public void serialize(LittleEndianOutput out) {out.writeShort(getRowNumber());out.writeShort(getFirstCol() == -1? (short)0 : getFirstCol());out.writeShort(getLastCol() == -1? (short)0 : getLastCol());out.writeShort(getHeight());out.writeShort(getOptimize());out.writeShort(field_6_reserved);out.writeShort(getOptionFlags());out.writeShort(getOptionFlags2());}
public PutAgentProfileResult putAgentProfile(PutAgentProfileRequest request) {request = beforeClientExecution(request);return executePutAgentProfile(request);}
public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex,Lexer lexer){ParseTreePatternMatcher m = new ParseTreePatternMatcher(lexer, this);return m.compile(pattern, patternRuleIndex);}
public DBCluster backtrackDBCluster(BacktrackDBClusterRequest request) {request = beforeClientExecution(request);return executeBacktrackDBCluster(request);}
public String toString() {return strategy;}
public byte[] toByteArray() {byte[] result = new byte[byteCount];System.arraycopy(bytes, 0, result, 0, byteCount);return result;}
public static LineMap createLineMap(byte[] bytes, int offset, int length) {return createLineMap(bytes, offset, length, null);}
public Set<String> getAdditionalHaves() {return Collections.emptySet();}
public long ramBytesUsed() {long ramBytesUsed = BASE_RAM_BYTES_USED;ramBytesUsed += fields.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;ramBytesUsed += formats.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;for(Map.Entry<String,FieldsProducer> entry: formats.entrySet()) {ramBytesUsed += entry.getValue().ramBytesUsed();}return ramBytesUsed;}
public String toXMLString(String tabString) {return tabString;}
public GalicianMinimalStemFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public SoraniFilter(TokenStream input) {super(input);}
public CreateOptionGroupResult createOptionGroup(CreateOptionGroupRequest request) {request = beforeClientExecution(request);return executeCreateOptionGroup(request);}
public AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest request) {request = beforeClientExecution(request);return executeAssociateMemberAccount(request);}
public void run() {try {assertNotStarted();refreshProgressTask.run();} catch (Exception e) {throw new RuntimeException(e.getMessage());}}
public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) {request = beforeClientExecution(request);return executeSetTerminationProtection(request);}
public String getErrorHeader(BasicHttpException e) {if (e.getCode()>0 ) {return "Internal Error";}if (e.getCode()>0) {return "Internal Error";}if (e.getCode()>0 && e.getCode()<0) {return "Internal Error";}if (e.getCode()>0 && e.getCode()<0) {return "Internal Error";}if (e.getCode()>0) {return "StandardError";}if (e.getCode()>0 && e.getCode()<0) {return "Internal Error";}if (e.getCode()>0 && e.getCode()<0 && e.getCode()<0) {return e.getCode();}return "";}
public CharBuffer asReadOnlyBuffer() {return duplicate();}
public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) {request = beforeClientExecution(request);return executeStopSentimentDetectionJob(request);}
public MapObjectIdsResult mapObjectIds(MapObjectIdsRequest request) {request = beforeClientExecution(request);return executeMapObjectIds(request);}
public void clearHashTable() {hashTable = null;}
public void reset() throws IOException {throw new IOException();}
public RefErrorPtg(LittleEndianInput in)  {field_1_error_Ptg = in.readShort();}
public SuspendGameServerGroupResult suspendGameServerGroup(SuspendGameServerGroupRequest request) {request = beforeClientExecution(request);return executeSuspendGameServerGroup(request);}
public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {switch (args.length) {case 1:return evaluate(srcRowIndex, srcColumnIndex, args[0]);case 0:return new NumberEval(srcColumnIndex+1);}return ErrorEval.VALUE_INVALID;}
public GetRepoRequest() {super("cr", "2016-06-07", "GetRepo", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]");setMethod(MethodType.GET);}
public void setDate(String date) {this.date = date;}
public GermanMinimalStemFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public Object clone() {try {return super.clone();} catch (CloneNotSupportedException e) {throw new Error(e);}}
public void write(char[] buf, int offset, int count) throws IOException {checkWritePrimitiveTypes();primitiveTypes.write(buf, offset, count);}
public static final RevFilter after(Date ts) {return after(ts.getTime());}
public DeleteGroupRequest(String groupName, String policyName) {setGroupName(groupName);setPolicyName(policyName);}
public DeregisterTransitGatewayMulticastGroupResult deregisterTransitGatewayMulticastGroup(DeregisterTransitGatewayMulticastGroupRequest request) {request = beforeClientExecution(request);return executeDeregisterTransitGatewayMulticastGroup(request);}
public DeleteScheduledActionsResult deleteScheduledActions(DeleteScheduledActionsRequest request) {request = beforeClientExecution(request);return executeDeleteScheduledActions(request);}
public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) {request = beforeClientExecution(request);return executeCreateAlgorithm(request);}
public int readUByte() {byte[] buf = new byte[1];try {checkEOF(read(buf), 1);} catch (IOException e) {throw new RuntimeException(e);}return LittleEndian.getUByte(buf);}
public void setLength(long sz) {setLength((int) sz);}
public DescribeScalingProcessTypesResult describeScalingProcessTypes() {return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest());}
public DescribeResourceRecordSetsResult describeResourceRecordSets(DescribeResourceRecordSetsRequest request) {request = beforeClientExecution(request);return executeDescribeResourceRecordSets(request);}
public Token recoverInline(Parser recognizer)throws RecognitionException{Token matchedSymbol = singleTokenDeletion(recognizer);if ( matchedSymbol!=null ) {recognizer.consume();return matchedSymbol;}if ( singleTokenInsertion(recognizer) ) {return getMissingSymbol(recognizer);}InputMismatchException e;if (nextTokensContext == null) {e = new InputMismatchException(recognizer);} else {e = new InputMismatchException(recognizer, nextTokensState, nextTokensContext);}throw e;}
public ListTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) {request = beforeClientExecution(request);return executeSetTagsForResource(request);}
public ModifyStrategyRequest(String cloudCallCenterId, String strategyId) {setCloudCallCenterId(cloudCallCenterId);setStrategyId(strategyId);}
public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) {request = beforeClientExecution(request);return executeDescribeVpcEndpointServices(request);}
public EnableLoggingResult enableLogging(EnableLoggingRequest request) {request = beforeClientExecution(request);return executeEnableLogging(request);}
public boolean contains(Object o) {return map.containsKey(o);}
public SheetRangeCommand setSheetName(String sheetName) {checkCallable();this.sheetName = sheetName;return this;}
public UpdateInstanceRequest(String domainName) {setDomainName(domainName);}
public ParseException(Token currentTokenVal,int[][] expectedTokenSequencesVal, String[] tokenImageVal) {super(new MessageImpl(QueryParserMessages.INVALID_SYNTAX, initialise(currentTokenVal, expectedTokenSequencesVal, tokenImageVal)));this.currentToken = currentTokenVal;this.expectedTokenSequences = expectedTokenSequencesVal;this.tokenImage = tokenImageVal;}
public FetchPhotosRequest() {super("CloudPhoto", "2017-07-11", "FetchPhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public PrintWriter() {return out;}
public NGramTokenizer(Map<String, String> args) {super(args);minGramSize = requireInt(args, "minGramSize");maxGramSize = requireInt(args, "maxGramSize");preserveOriginal = getBoolean(args, "preserveOriginal", NGramTokenizer.DEFAULT_PRESERVE_ORIGINAL);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public boolean isDirectoryFileConflict() {return false;}
public StemDerivational(boolean stemDerivational) {this.stemDerivational = stemDerivational;}
public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) {request = beforeClientExecution(request);return executeCreateTrafficPolicy(request);}
public void serialize(LittleEndianOutput out) {out.writeShort(getClass().getName());out.writeByte(getPassword());}
public static double floor(double n) {return n < 0? -n : n;}
public ByteArrayBuffer(byte[] bytes, int offset, int len) {reset(bytes, offset, len);}
public static List<? extends Tree> getChildren(Tree t) {if ( t.getParent()==null ) return Collections.emptyList();List<Tree> children = new ArrayList<Tree>();t.getParent().add(t);return children;}
@Override public void clear() {HashMap.this.clear();}
public RefreshRecordResult refreshRecord(RefreshRecordRequest request) {request = beforeClientExecution(request);return executeRefreshRecord(request);}
public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) {request = beforeClientExecution(request);return executeDeleteNamedQuery(request);}
public GraphvizFormatter(java.util.List<Double> connection costs) {this.costs = connection costs;}
public CheckMultiagentRequest() {super("industry-brain", "2018-07-12", "CheckMultiagent");setProtocol(ProtocolType.HTTPS);setMethod(MethodType.POST);}
public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) {request = beforeClientExecution(request);return executeListUserProfiles(request);}
public CreateRelationalDatabaseResult createRelationalDatabase(CreateRelationalDatabaseRequest request) {request = beforeClientExecution(request);return executeCreateRelationalDatabase(request);}
public StartTaskResult startTask(StartTaskRequest request) {request = beforeClientExecution(request);return executeStartTask(request);}
public SetIgnoredPathsResult ignoredPaths(SetIgnoredPathsRequest request) {request = beforeClientExecution(request);return executeListIgnoredPaths(request);}
public FeatSmartTag(LittleEndianInput in)  {field_1_year = in.readInt();field_2_month = in.readInt();field_3_day = in.readInt();field_4_month_year = in.readInt();field_5_day = in.readInt();}
public ChangeActionResourceRecordSet(String changeAction, ResourceRecordSet resourceRecordSet) {setChangeAction(changeAction);setResourceRecordSet(resourceRecordSet);}
public BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest request) {request = beforeClientExecution(request);return executeBatchDeleteImage(request);}
public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) {request = beforeClientExecution(request);return executeCreateConfigurationSet(request);}
public Iterator<E> iterator() {return listIterator(0);}
public void visitContainedRecords(RecordVisitor rv) {if (_validationList.isEmpty()) {return;}rv.visitRecord(_headerRec);_validationList.clear();}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[FtCbls]\n");buffer.append("  size     = ").append(length).append("\n");buffer.append("  flags    = ").append(HexDump.toHex(flags)).append("\n");buffer.append("[/FtCbls]\n");return buffer.toString();}
public CreateBATBlockResult createBATBlock(CreateBATBlockRequest request) {request = beforeClientExecution(request);return executeCreateBATBlock(request);}
public PutResourceResult putResource(PutResourceRequest request) {request = beforeClientExecution(request);return executePutResource(request);}
public DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest request) {request = beforeClientExecution(request);return executeDeleteMailboxPermissions(request);}
public DescribeDatasetGroupsResult describeDatasetGroups(DescribeDatasetGroupsRequest request) {request = beforeClientExecution(request);return executeDescribeDatasetGroups(request);}
public ResumeProcessesResult resumeProcesses(ResumeProcessesRequest request) {request = beforeClientExecution(request);return executeResumeProcesses(request);}
public DescribeAccountResult describeAccount(DescribeAccountRequest request) {request = beforeClientExecution(request);return executeDescribeAccount(request);}
public String toFormulaString(String[] operands) {StringBuilder buf = new StringBuilder();if(isExternalFunction()) {buf.append(operands[0]); appendArgs(buf, 1, operands);} else {buf.append(getName());appendArgs(buf, 0, operands);}return buf.toString();}
public static Object merge(Object a, Object b) {return a;}
public String toString() {final StringBuilder r = new StringBuilder();r.append(getSeverity().name().toLowerCase(Locale.ROOT));r.append(": at offset "); r.append(getOffset());r.append(": "); r.append(getMessage());r.append("\n"); r.append("  in "); r.append(getLineText());return r.toString();}
public XPathFactory(Parser parser, String path) {this(path, Paths.get(path));}
public CreateAccountAliasRequest(String accountId) {setAccountId(accountId);}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long byte0 = blocks[blocksOffset++] & 0xFF;final long byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte0 << 2) | (byte1 >>> 6);final long byte2 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 63) << 4) | (byte2 >>> 4);final long byte3 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte2 & 15) << 6) | (byte3 >>> 2);final long byte4 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte3 & 3) << 8) | byte
public PushConnection openPush() throws NotSupportedException {throw new NotSupportedException(JGitText.get().pushIsNotSupportedForBundleTransport);}
public void copy(char[] dst, int di, int srcStart, int dstEnd) {for (int i = 0; i < src.length; i++) {dst[i] = src[srcStart++];src[srcStart++] = dst[dstStart++];dst[dstEnd++] = i + 1;}}
public K getKey() {return mapEntry.getKey();}
public static int size(Object[] array) {int len = array.length;if (len > 0) {for (int i = 0; i < len; i++) {if (array[i] == null) {return len;}}}return len;}
public void add(int location, E object) {listIterator(location).add(object);}
public GetDomainDetailResult getDomainDetail(GetDomainDetailRequest request) {request = beforeClientExecution(request);return executeGetDomainDetail(request);}
public void flush() throws IOException {throw new UnsupportedOperationException();}
public PersianCharFilter(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public boolean incrementToken() {if (used) {return false;}clearAttributes();termAttribute.append(value);offsetAttribute.setOffset(0, value.length());used = true;return true;}
public static FloatBuffer allocate(int capacity) {if (capacity < 0) {throw new IllegalArgumentException();}return new ReadWriteFloatArrayBuffer(capacity);}
public final Edit after(Edit cut, int length) {List<String> temp = new ArrayList<>();temp.add(cut);temp.add(before.toString());temp.add(cut);temp.add(after.toString());temp.add(after.toString());temp.add(after.toString());temp.add(after.toString());temp.add(after.toString());temp.add(after.toString());temp.add(after.toString());temp.add(this.toString());temp.add(this.add(this.add());temp.add(this.add(this.add());temp.add(this.add(this.add());temp.add(this.add(this.add());temp.add(this.add(this.add());temp.add(this.add(this
public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) {request = beforeClientExecution(request);return executeUpdateRuleVersion(request);}
public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) {request = beforeClientExecution(request);return executeListVoiceConnectorTerminationCredentials(request);}
public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) {request = beforeClientExecution(request);return executeGetDeploymentTarget(request);}
public void setNoChildReport(NoChildReport report) {this.report = report;}
public E get(int location) {try {return listIterator(location).next();} catch (NoSuchElementException e) {throw new IndexOutOfBoundsException();}}
public DescribeDataSetResult describeDataSet(DescribeDataSetRequest request) {request = beforeClientExecution(request);return executeDescribeDataSet(request);}
public void setTreeIndex(int treeIndex) {treeIndex = treeIndex;}
public DescribeNetworkInterfacesResult describeNetworkInterfaces() {return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest());}
public boolean contains(int row, int col) {return row >= 0 && col >= 0;}
public synchronized String toString() {return new String(chars, offset, length);}
public String patchType() {return patchType;}
public Iterator<K> iterator() {return newKeyIterator();}
public CreateScriptResult createScript(CreateScriptRequest request) {request = beforeClientExecution(request);return executeCreateScript(request);}
public BytesRef next() {assert iter.hasNext();return iter.next();}
public String output() {return String.valueOf(output());}
public AssociateAuthorizationProviderResult associateAuthorizationProvider(AssociateAuthorizationProviderRequest request) {request = beforeClientExecution(request);return executeAssociateAuthorizationProvider(request);}
public void unpop() {if (!populated) {throw new IllegalStateException("Cannot unpop after pop");}}
public EdgeNGramTokenizerFactory(Map<String, String> args) {super(args);maxTokenLength = getInt(args, "maxTokenLength", EdgeNGramTokenizer.DEFAULT_MAX_TOKEN_LENGTH);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public DBParameterGroup modifyDBParameterGroup(ModifyDBParameterGroupRequest request) {request = beforeClientExecution(request);return executeModifyDBParameterGroup(request);}
public GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest request) {request = beforeClientExecution(request);return executeGetHostedZoneLimit(request);}
public void set(int index, int n) {if (count < index)throw new ArrayIndexOutOfBoundsException(index);else if (count == index)add(n);elseentries[index] = n;}
public TreeFilter clone() {return new Binary(a.clone(), b.clone());}
public String toString(String field) {StringBuilder buffer = new StringBuilder();buffer.append("spanNot(");buffer.append(include.toString(field));buffer.append(", ");buffer.append(exclude.toString(field));buffer.append(", ");buffer.append(Integer.toString(pre));buffer.append(", ");buffer.append(Integer.toString(post));buffer.append(")");return buffer.toString();}
public boolean canAppendHeads() {return false;}
public int lastIndexOf(char s[], int len) {if (s == 0) {return len-1;}int pos = 0;for (int i = 0; i < s.length; i++) {if (s[i] == s[pos]) {pos++;return i;}}}return -1;}
public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) {request = beforeClientExecution(request);return executeDeleteNetworkAclEntry(request);}
public AssociateMemberWithGroupRequest(String groupName, String member, String description) {setGroupName(groupName);setMember(member);setDescription(description);}
public static final int firstCommitter(byte[] b, int ptr, int len) {return findCommitter(b, ptr, len);}
public int getLine() {return line;}
public SubmoduleInitCommand addPath(String path) {paths.add(path);return this;}
public GetPushTemplateResult getPushTemplate(GetPushTemplateRequest request) {request = beforeClientExecution(request);return executeGetPushTemplate(request);}
public GetVaultResult getVault(GetVaultRequest request) {request = beforeClientExecution(request);return executeGetVault(request);}
public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() {return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest());}
public ByteBuffer putLong(int index, long value) {checkIndex(index, SizeOf.LONG);Memory.pokeLong(backingArray, offset + index, value, order);return this;}
public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) {request = beforeClientExecution(request);return executeRegisterDevice(request);}
public String getFormat(int id) {return formats.get(id);}
public DeleteAppResult deleteApp(DeleteAppRequest request) {request = beforeClientExecution(request);return executeDeleteApp(request);}
public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest request) {request = beforeClientExecution(request);return executeGetBaiduChannel(request);}
public BytesReader getBytesReader() {return bytesReader;}
public boolean isValidScheme(int index) {return scheme.charAt(index);}
public ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest request) {request = beforeClientExecution(request);return executeListAppliedSchemaArns(request);}
public String getUser() {return user;}
public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {switch (args.length) {case 1:return evaluate(args[0], srcRowIndex, srcColumnIndex);case 2:return evaluate(args[0], srcRowIndex, srcColumnIndex);case 3:return evaluate(args[0], srcRowIndex, srcColumnIndex);case 4:return evaluate(args[0], srcRowIndex, srcColumnIndex);case 5:return evaluate(args[1], srcRowIndex, srcColumnIndex);}return evaluate(args[1], srcRowIndex, srcColumnIndex);}
public boolean equals(Object array, int position) {if (array == null) {return false;}if (position < array.length) {return false;}int originalLength = array.length - array.length;if (position > originalLength) {return false;}return position == originalLength;}
public void removeName(int nameIndex) {if (nameIndex < 0 || nameIndex >= names.size() ) {return;}if (index > -1) {return;}if (names.get(nameIndex)!= null) {names.remove(nameIndex);if (names.size() > 1) {workbook.removeName(nameIndex);} else {workbook.addName(nameIndex, nameIndex);}}}
public UpdateAttributesRequest(String queueUrl, java.util.List<AttributeName> attributeNames) {setQueueUrl(queueUrl);setAttributeNames(attributeNames);}
public static boolean[] copyOf(boolean[] original, int newLength) {if (newLength < 0) {throw new NegativeArraySizeException();}return copyOfRange(original, 0, newLength);}
public void setEnabled(boolean value) {this.enabled = value;}
public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) {request = beforeClientExecution(request);return executeDeleteLogPattern(request);}
@Override public boolean contains(Object key) {return subMap.containsKey(key);}
public int getFirstSheetIndexForExternSheet(int externSheetIndex) {return _iBook.getFirstSheetIndexForExternSheet(externSheetIndex);}
public boolean isValidCommandLine(String cmds[]) {if (cmds.length == 0) {return false;}for (int i = 0; i < cmds.length; i++) {String c = cmds[i].trim();if (c.length() == 0) {return false;}}return true;}
public static void registerMergeStrategy(RegisterMergeStrategyRequest request) {request = beforeClientExecution(request);}
public long ramBytesUsed() {return fst == null? 0 : fst.ramBytesUsed();}
public HostedHostedZone(String hostedZoneId, String name) {setHostedZoneId(hostedZoneId);setName(name);}
public GetFindingsResult getFindings(GetFindingsRequest request) {request = beforeClientExecution(request);return executeGetFindings(request);}
public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request) {request = beforeClientExecution(request);return executeDescribeTopicsDetectionJob(request);}
public boolean processMatch(ValueEval eval) {if(result == null) {result = eval;}else {if(result instanceof BlankEval) {result = eval;}else {if(!(eval instanceof BlankEval)) {result = ErrorEval.NUM_ERROR;return false;}}}return true;}
public void write(LittleEndianOutput out) {out.writeByte(sid + getPtgClass());out.writeShort(field_1_index_extern_sheet);out.writeInt(unused1);out.writeInt(unused2);}
public void run() {List<String> taxonomyStats = new ArrayList<>();String s = System.getProperty("line.separator");List<String> taxonomyFiles = new ArrayList<>();System.setProperty("line.separator", s);for (String taxonomyFile : taxonomyFiles) {System.setProperty("line.separator", s);if (!s.isEmpty()) {taxonomyFiles.add(taxonomyFile);}}}
public ByteField(byte value) {setValue(value);}
public MultisetCache(int defaultSeed) {super(defaultSeed);}
public SimpleDateFormatCacheSource(String source) {this.source = source;}
public AttributeValue(String attributeName, AttributeType attributeType) {setAttributeName(attributeName);setAttributeType(attributeType);}
public static String join(String separator, Collection<String> strings) {return join(separator, strings);}
public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest request) {request = beforeClientExecution(request);return executeListTaskDefinitionFamilies(request);}
public ListComponentsResult listComponents(ListComponentsRequest request) {request = beforeClientExecution(request);return executeListComponents(request);}
public activatePhotoRequest() {super("CloudPhoto", "2017-07-11", "ActivatePhoto", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public CreateMatchsetRuleSetResult createMatchsetRuleSet(CreateMatchsetRuleSetRequest request) {request = beforeClientExecution(request);return executeCreateMatchsetRuleSet(request);}
public DescribeCidrRangesResult describeCidrRanges(DescribeCidrRangesRequest request) {request = beforeClientExecution(request);return executeDescribeCidrRanges(request);}
public Map<BaseObjectId, String> getBaseObjectIds() {return baseObjectIds;}
public DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest request) {request = beforeClientExecution(request);return executeDeletePushTemplate(request);}
public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) {request = beforeClientExecution(request);return executeCreateDomainEntry(request);}
public static int getEncodedSize(Object[] objects) {int result = 0;for (Object o : objects) {result += o.getRawSize();}return result;}
public OpenNLPTokenizerFactory(Map<String,String> args) {super(args);pos = 0;}
public int getInt(int index) {checkIndex(index);return backingArray[offset + index];}
public List<Head> matchingHeads(int c) {return matchingHeads(c);}
public ByteBuffer putShort(short value) {throw new ReadOnlyBufferException();}
public void writeUnsharedObject(ObjectInserter out) {writeContinueIfRequired(1);_ulrOutput.writeObject(out);}
public int offsetBy(int codePoint) {return codePoint;}
public static int getUniqueAltNumber(Collection<Set<String>> altsets) {for (Set<Set<String>> altsets : altsets) {if (altsets.contains(altset.getName())) {return +1;}}return 0;}
public String getWhen() {return when;}
public TokenStream(String ruleName, String label, boolean bypassTokenType) {this.ruleName = ruleName;this.bypassTokenType = bypassTokenType;this.label = label;}
public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) {request = beforeClientExecution(request);return executeDisableOrganizationAdminAccount(request);}
public CreateRoomResult createRoom(CreateRoomRequest request) {request = beforeClientExecution(request);return executeCreateRoom(request);}
public DeleteReplicationGroupResult deleteReplicationGroup(DeleteReplicationGroupRequest request) {request = beforeClientExecution(request);return executeDeleteReplicationGroup(request);}
public void decode(byte[] blocks, int blocksOffset, char[] values, int valuesOffset, int iterations) {Arrays.checkOffsetAndCount(blocksOffset, bitsOffset, iterations);for (int i = 0; i < iterations; ++i) {final int byte3 = blocks[blocksOffset++] & 0xFF;final int byte2 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte3 << 4) | (byte2 >>> 4);final int byte4 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte3 & 0xFF) << 2) | (byte2 >>> 4);final int byte5 = blocks[blocksOffset++] & 0xFF;final int byte6 = blocks[blocksOffset++] & 0xFF;final int byte7 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte
public GetDistributionRequest(String id, Integer idStatus, String domainName) {setId(id);setIdStatus(idStatus);setDomainName(domainName);}
public final double[] array() {return protectedArray();}
public DateWindow1904Record() {_dateWindow1904 = new Date(0);}
public DBSnapshotDeleteRequest(String id) {setId(id);}
public String getParserExtension(String key) {return key.toLowerCase(Locale.ROOT);}
public RegisterChunkerModelResult registerChunkerModel(RegisterChunkerModelRequest request) {request = beforeClientExecution(request);return executeRegisterChunkerModel(request);}
public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) {request = beforeClientExecution(request);return executeCompleteVaultLock(request);}
public CharInterval[] copy() {return new CharInterval[] { new CharInterval(0), new CharInterval(1), new CharInterval(2), new CharInterval(3), };}
public long ramBytesUsed() {return values.ramBytesUsed()+ super.ramBytesUsed()+ Long.BYTES+ RamUsageEstimator.NUM_BYTES_OBJECT_REF;}
public RegisterInstanceWithLoadBalancerResult registerInstanceWithLoadBalancer(RegisterInstanceWithLoadBalancerRequest request) {request = beforeClientExecution(request);return executeRegisterInstanceWithLoadBalancer(request);}
public DescribeClusterUserKubeconfigRequest() {super("cr", "2016-06-07", "DescribeClusterUserKubeconfig", "cr");setUriPattern("/users/[Username]/[Password]/kubeconfig");setMethod(MethodType.POST);}
public PrecisionRecord(RecordInputStream in) {field_1_first_row = in.readShort();field_2_first_col = in.readShort();field_3_first_col = in.readShort();field_4_first_col = in.readShort();field_5_first_col = in.readShort();}
public void serialize(LittleEndianOutput out) {for (int i = 0; i < mRowCount; i++) {out.writeShort(mRowIndex);out.writeShort(mColumnIndex);}out.writeShort(mReadOnly);}
public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) {request = beforeClientExecution(request);return executeDeleteVirtualInterface(request);}
public Entry<String, String> getEntry(String name) throws FileNotFoundException, FileNotFoundException {FileEntry result = null;try {if (exists(name)) {result = new Entry<String, String>(name));} else {Throws FileNotFoundException e;} catch (IOException e) {throw new FileNotFoundException(e.getMessage(), e);}if (result == null) {throw new FileNotFoundException(name, e);}return result;}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[USESELFS]\n");buffer.append("   .options = ").append(HexDump.shortToHex(_options)).append("\n");buffer.append("[/USESELFS]\n");return buffer.toString();}
public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) {request = beforeClientExecution(request);return executeDeleteVoiceConnectorOrigination(request);}
public Appendable append(char c) {write(c);return this;}
public String getGenerationFromSegmentsFileName(String segmentsFileName) {return segmentsFileName.substring(0, segmentsFileName.lastIndexOf('.'));}
public TagCommand tag(TagOption tag) {super(tag);this.tag = tag;}
public StartContentModerationResult startContentModeration(StartContentModerationRequest request) {request = beforeClientExecution(request);return executeStartContentModeration(request);}
public static String quoteEscape(String original) {String replacement = original;if (replacement.length() > 0) {replacement = replacement.substring(1, replacement.length() - 1);}return replacement;}
public final V setValue(V value) {if (value == null) {throw new NullPointerException();}V oldValue = this.value;this.value = value;return oldValue;}
public QueryParserTokenManager(CharStream stream){input_stream = stream;}
public double value(long elapsedTime) {return 1 + (int) (elapsedTime / NANOS_PER_SECOND);}
public ByteBuffer get(byte[] dst, int dstOffset, int byteCount) {checkGetBounds(1, dst.length, dstOffset, byteCount);System.arraycopy(backingArray, offset + position, dst, dstOffset, byteCount);position += byteCount;return this;}
public void removeErrorListeners() {errorListeners.clear();}
public TokenStream(TokenSource tokenSource, int channel) {this(tokenSource);this.channel = channel;}
public GetObjectPoliciesResult getObjectPolicies(GetObjectPoliciesRequest request) {request = beforeClientExecution(request);return executeGetObjectPolicies(request);}
public ObjectPackedRequest(String type) {super(type);this.type = type;}
public int stem(char s[], int len) {if (len < 4) return len;final int origLen = len;len = rule0(s, len);len = rule1(s, len);len = rule2(s, len);len = rule3(s, len);len = rule4(s, len);len = rule5(s, len);len = rule6(s, len);len = rule7(s, len);len = rule8(s, len);len = rule9(s, len);len = rule10(s, len);len = rule11(s, len);len = rule12(s, len);len = rule13(s, len);len = rule14(s, len);len = rule15(s, len);len = rule16(s, len);len = rule17(s, len);len = rule18(s, len
public void reportError(Parser recognizer, RecognitionException e) {for (ParserRuleContext context = recognizer.getContext(); context!= null; context = context.getParent()) {context.exception = e;}throw new ParseCancellationException(e);}
public String toFormulaString() {return field_3_string;}
public UnlinkFaceRequest() {super("LinkFace", "2018-07-20", "UnlinkFace");setProtocol(ProtocolType.HTTPS);setMethod(MethodType.POST);}
public void setOption(String name, String value) {setOption(name, value == null? null : value.toCharArray());}
public static String getFullString(String key) {StringBuilder result = new StringBuilder();result.append(key);return result.toString();}
public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) {request = beforeClientExecution(request);return executeDescribeMountTargetSecurityGroups(request);}
public GetApiMappingResult getApiMapping(GetApiMappingRequest request) {request = beforeClientExecution(request);return executeGetApiMapping(request);}
public UpdateRequest(String url) {setUrl(url);}
public Field(int field_1_len_ref_subexpression) {field_1_len_ref_subexpression = field_1_len_ref_subexpression;}
public GetHighestFreqTermsResult getHighestFreqTerms(GetHighFreqTermsRequest request) {request = beforeClientExecution(request);return executeGetHighestFreqTerms(request);}
public DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest request) {request = beforeClientExecution(request);return executeDeleteApnsVoipChannel(request);}
public ListFacesResult listFaces(ListFacesRequest request) {request = beforeClientExecution(request);return executeListFaces(request);}
public CacheDistanceValueSource(int cacheDistanceValue, BytesRef source) {setSource(source);setCacheDistanceValue(cacheDistanceValue);}
public char charAt(int index) {return (char) (buffer[startPtr + index] & 0xff);}
public UpdateConfigurationProfileResult updateConfigurationProfile(UpdateConfigurationProfileRequest request) {request = beforeClientExecution(request);return executeUpdateConfigurationProfile(request);}
public ListLifecycleHooksResult listLifecycleHooks(ListLifecycleHooksRequest request) {request = beforeClientExecution(request);return executeListLifecycleHooks(request);}
public ListHostReservationsResult listHostReservations(ListHostReservationsRequest request) {request = beforeClientExecution(request);return executeListHostReservations(request);}
public PredictionContext(RuleContext ruleContext) {this.ruleContext = ruleContext;this.offset = ruleContext.getOffset();this.length = ruleContext.getLength();return this;}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[SXVDEX]\n");buffer.append("   .sxaxis    = ").append(HexDump.shortToHex(_sxaxis)).append('\n');buffer.append("   .cSub      = ").append(HexDump.shortToHex(_cSub)).append('\n');buffer.append("   .grbitSub  = ").append(HexDump.shortToHex(_grbitSub)).append('\n');buffer.append("   .cItm      = ").append(HexDump.shortToHex(_cItm)).append('\n');buffer.append("   .name      = ").append(HexDump.shortToHex(_name)).append('\n');buffer.append("[/SXVDEX]\n");return buffer.toString();}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[Blame Result]\n");buffer.append("   .blame   = ").append(Integer.toHexString(getBlame())).append("\n");buffer.append("[/Blame Result]\n");return buffer.toString();}
public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) {request = beforeClientExecution(request);return executeListChangeSets(request);}
public boolean isAllowNonFastForwards() {return allowNonFastForwards;}
public FeatRecord() {field_1_year = 0;field_2_month = 0;field_3_year = 0;field_4_month = 0;field_5_year = 0;}
public ShortBuffer put(short c) {throw new ReadOnlyBufferException();}
public SpanPositionCheckQuery(SpanQuery query) {this.query = query;}
public StashApplyCommand stashApply() {return new StashApplyCommand(repo);}
public Set<String> getNames() {return Collections.unmodifiableSet(dictionary.keySet());}
public static int getEffectivePort(String getScheme(), int port) {int effectiveScheme, effectivePort;if (scheme.indexOf(':') == -1) {effectiveScheme = scheme.indexOf(':');}if (effectiveScheme!= -1) {throw new IllegalArgumentException("Unknown scheme: '" + scheme + "' port=" + effectiveScheme + "'");}if (effectivePort == -1) {return -1;}return effectivePort;}
public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) {request = beforeClientExecution(request);return executeListAssessmentTemplates(request);}
public DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest request) {request = beforeClientExecution(request);return executeRestoreDBClusterFromSnapshot(request);}
public void addShape(HSSFShape shape) {if (shapes==null ) {shapes = new ArrayList<>();}shapes.add(shape);}
public boolean equals(Object o) {return this.getClass() == o.getClass();}
public static final int indexOf(char c, byte[] b, int offset, int len) {for (int i = offset; i < len; i++) {if (b[i] == c) {return i;}}return -1;}
public boolean isDeltaRepresentation() {return true;}
public void emitEOF() {this.eof = true;}
public GetUserCredentialsRequest(String userName) {setUserName(userName);}
public static final RevFilter notPresent(RevFilter set) {return set;}
public TagCommand setTagger(String tagger) {this.tagger = tagger;return this;}
public SortMemoryResult sort(SortMemoryRequest request) {request = beforeClientExecution(request);return executeSortMemory(request);}
public static String trimTrailingWhitespace(String raw, int start, int end) {if (start > end) {return raw.substring(start, end);}return "";}
public TopMarginRecord(RecordInputStream in) {field_1_margin = in.readDouble();}
public GetEnvironmentInfoRequest() {super("cr", "2016-06-07", "GetEnvironmentInfo", "cr");setUriPattern("/env-info");setMethod(MethodType.GET);}
public PutPlayerSessionsResult putPlayerSessions(PutPlayerSessionsRequest request) {request = beforeClientExecution(request);return executePutPlayerSessions(request);}
public CreateProxySessionResult createProxySession(CreateProxySessionRequest request) {request = beforeClientExecution(request);return executeCreateProxySession(request);}
public final Class<?> getObjectType() {return (Class<?>) object.getClass();}
public String getScheme() {return scheme;}
public StringBuilder append(CharSequence csq) {append(csq, 0, csq.length());}
public FetchAlbumTagPhotosRequest() {super("CloudPhoto", "2017-07-11", "FetchAlbumTagPhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public DeleteMembersResult deleteMembers(DeleteMembersRequest request) {request = beforeClientExecution(request);return executeDeleteMembers(request);}
public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) {request = beforeClientExecution(request);return executeGetContactReachabilityStatus(request);}
public void remove(Object o) {throw new UnsupportedOperationException();}
public E getLast() {return backingMap.lastEntry();}
public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest request) {request = beforeClientExecution(request);return executeCreateStreamingDistribution(request);}
public boolean isAbsolute() {return path.length() > 0 && path.charAt(0) == separatorChar;}
public DisableAddOnResult disableAddOn(DisableAddOnRequest request) {request = beforeClientExecution(request);return executeDisableAddOn(request);}
public GetAliasResult getAlias(GetAliasRequest request) {request = beforeClientExecution(request);return executeGetAlias(request);}
public void next(int delta) {if (delta == 1) {prevPtr = currPtr;currPtr = nextPtr;if (!eof())parseEntry();return;}final int end = raw.length;int ptr = nextPtr;while (--delta > 0 && ptr!= end) {prevPtr = ptr;while (raw[ptr]!= 0)ptr++;ptr += OBJECT_ID_LENGTH + 1;}if (delta!= 0)throw new ArrayIndexOutOfBoundsException(delta);currPtr = ptr;if (!eof())parseEntry();}
public TreeFilter clone() {return new Binary(a.clone(), b.clone());}
public Reader create(Reader input) {return new PersianCharFilter(input, min, max);}
public String getOption() {return option;}
public String toString() {return "dels=" + Arrays.toString(item);}
public GetSignalingChannelResult getSignalingChannel(GetSignalingChannelRequest request) {request = beforeClientExecution(request);return executeGetSignalingChannel(request);}
public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) {request = beforeClientExecution(request);return executeAttachStaticIp(request);}
public String toString() {return "CellReference(cellIndex=" + cellIndex + " cellIndexMe=" + cellIndexMe + ")";}
public BloomFilteringPostingsFormat() {super(BloomFilteringPostingsFormat.class);}
public ListTemplatesResult listTemplates(ListTemplatesRequest request) {request = beforeClientExecution(request);return executeListTemplates(request);}
public TimerThread(Resolution resolution, Counter counter) {super(resolution);this.counter = counter;}
public void resetDrawingRecordData() {drawingRecordData = EMPTY_BYTE_ARRAY;}
public GetDirectoriesResult getDirectories(GetDirectoriesRequest request) {request = beforeClientExecution(request);return executeGetDirectories(request);}
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final int byte0 = blocks[blocksOffset++] & 0xFF;final int byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte0 << 6) | (byte1 >>> 2);final int byte2 = blocks[blocksOffset++] & 0xFF;final int byte3 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 3) << 12) | (byte2 << 4) | (byte3 >>> 4);final int byte4 = blocks[blocksOffset++] & 0xFF;final int byte5 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte3 & 15) << 10) | (byte
public DisableCachingResult disableCaching(DisableCachingRequest request) {request = beforeClientExecution(request);return executeDisableCaching(request);}
public static int idealSize(byte[] array) {return idealSize(array == null? 0 : array.length);}
public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) {request = beforeClientExecution(request);return executeUpdateAssessmentTarget(request);}
public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) {request = beforeClientExecution(request);return executeModifyVolume(request);}
public Cell merge(Cell m, Cell e) {Cell n = new Cell();if (m.skip!= e.skip) {return null;}if (m.cmd >= 0) {if (e.cmd >= 0) {if (m.cmd == e.cmd) {n.cmd = m.cmd;} else {return null;}} else {n.cmd = m.cmd;}} else {n.cmd = e.cmd;}if (m.ref >= 0) {if (e.ref >= 0) {if (m.ref == e.ref) {if (m.skip == e.skip) {n.ref = m.ref;} else {return null;}} else {return null;}} else {n.ref = m.ref;}} else {n.ref = e.ref;}n.cnt = m.cnt + e.cnt;n.skip = m
public long read(byte[] b, int position, int len) throws IOException {return read(b, position, len, null);}
public void respondActivityTaskCompleted(RespondActivityTaskCompletedRequest request) {request = beforeClientExecution(request);executeRespondActivityTaskCompleted(request);}
public void incrementProgress(float amount) {total += amount;}
public boolean equals(Object o) {if (lastModifiedTime() == null) {return false;}if (lastModifiedTime() instanceof Entry) {Entry<?> entry = (Entry<?>) o;return lastModifiedTime.getTime() == entry.getLastModified();}return lastModifiedTime().getTime() < entry.getLastModifiedTime();}
public NumberRecord(RecordInputStream in) {int size = in.remaining();if (size < 2) {throw new IllegalArgumentException("Invalid RKRecord length: " + size);}int i = 0;RKRecord rK = new RKRecord(size);for (int i=0; i<size; i++) {int k = in.readUByte();if (k < 0) {throw new RuntimeException("Invalid RK Record size: " + k);} else if (k < size-1) {k = n-1;} else {k = rK;}}else {throw new IllegalArgumentException("Invalid RK Record size: " + k + " vs " + i + " vs " + n + " values");}size = Math.min(size, size);return new NumberRecord(size);}
public CharBuffer put(char[] src, int srcOffset, int charCount) {Arrays.checkOffsetAndCount(src.length, srcOffset, charCount);if (charCount > remaining()) {throw new BufferOverflowException();}System.arraycopy(src, srcOffset, backingArray, offset + position, charCount);position += charCount;return this;}
public int getCells() {return cells;}
public BeiderMorseFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public static double variance(double[] v) {double r = Double.NaN;if (v!=null && v.length > 0) {r = Math.sqrt( r * v);}return r;}
public PersianNormalizationFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public WeightedTerm[] getTerms() {return getTerms(new TermQuery());}
public DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest request) {request = beforeClientExecution(request);return executeDeleteDocumentationPart(request);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[USESELFS]\n");buffer.append("   .options = ").append(HexDump.shortToHex(_options)).append("\n");buffer.append("[/USESELFS]\n");return buffer.toString();}
public short getShort(int index) {checkIndex(index, SizeOf.SHORT);return Memory.peekShort(backingArray, offset + index, order);}
public String toFormulaString() {return Formula.add(Formula.add(1.0f, "x", "y", "z", "0.0f));}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) {double value;try {value = evaluate(arg0, arg1);} catch (EvaluationException e) {return e.getErrorEval();}return new NumberEval(value);}
public void clearWeightBySpanQuery(WeightBySpanQuery query) {if (query == null) {return;}weightBySpanQuery.clear();weightBySpanQuery.clear();}
public int endOfString() {return endIndex == null? -1 : endIndex;}
public Query primary() {return primary;}
public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) {request = beforeClientExecution(request);return executeDeleteApiKey(request);}
public InsertTagsRequest() {super("cr", "2016-06-07", "InsertTags", "cr");setUriPattern("/tags");setMethod(MethodType.POST);}
public DeleteUserPrincipalResult deleteUserPrincipal(DeleteUserPrincipalRequest request) {request = beforeClientExecution(request);return executeDeleteUserPrincipal(request);}
public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) {request = beforeClientExecution(request);return executeDescribeNetworkInterfaces(request);}
public int serialize(int offset, byte[] data, EscherSerializationListener listener) {listener.beforeRecordSerialize( offset, getRecordId(), this );if (remainingData == null) {remainingData = EMPTY;}LittleEndian.putShort( data, offset, getOptions() );LittleEndian.putShort( data, offset + 2, getRecordId() );LittleEndian.putInt( data, offset + 4, remainingData.length );System.arraycopy( remainingData, 0, data, offset + 8, remainingData.length );int pos = offset + 8 + remainingData.length;listener.afterRecordSerialize( pos, getRecordId(), pos - offset, this );return pos - offset;}
public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) {request = beforeClientExecution(request);return executeCreateSecurityConfiguration(request);}
public DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest request) {request = beforeClientExecution(request);return executeDescribeClientVpnConnections(request);}
public static void fill(double[] array, double value) {for (int i = 0; i < array.length; i++) {array[i] = value;}}
public boolean hasNext() {return mIterator.hasNext();}
public Postings(int[] postings) {this.postings = postings;upto = 1;return this;}
public final boolean hasAny(RevFlagSet set) {return (flags & set.mask)!= 0;}
public ModifyAccountResult modifyAccount(ModifyAccountRequest request) {request = beforeClientExecution(request);return executeModifyAccount(request);}
public Token getToken(int k) {return token;}
public void removeSheet(int sheetIdx) {_externSheetRecord.removeSheet(sheetIdx);}
public void removeName(String name) {int idx = indexOfName(name);if (idx!= -1) {names.remove(idx);}}
public boolean equals(final Object o) {if (!(o instanceof Property)) {return false;}final Property prop = (Property) o;return this.name.equals(prop.name);}
public GetRepoBuildListRequest() {super("cr", "2016-06-07", "GetRepoBuildList", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/buildList");setMethod(MethodType.GET);}
public MessageWriter(MessageFormat format, Reader reader) {super(format);this.reader = reader;}
public void append(E record) {if (currentRecord == null) {currentRecord = new byte[0];}currentRecord.setValue(record.getValue());currentRecord.setKey(record.getKey());currentRecord.setBool(true);}
public void close() {packfile.close();}
public GetModelPackageResult getModelPackage(GetModelPackageRequest request) {request = beforeClientExecution(request);return executeGetModelPackage(request);}
public HSSFCell(DataInput in, int rowIndex, int columnIndex) {field_1_row_index = rowIndex;field_2_column_index = columnIndex;}
public Object clone() {try {final Decompressor r = (Decompressor) super.clone();if (r == null) {return null;}return r;} catch (CloneNotSupportedException e) {throw new AssertionError();}}
public UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest request) {request = beforeClientExecution(request);return executeUpdateS3Resources(request);}
public GroupQueryNode add(SrndQueryNode query) {setQuery(query);}
public CharSequence toQueryString(EscapeQuerySyntax escaper) {if (name == null) {return "";}StringBuilder sb = new StringBuilder();for (QueryNode child : path) {sb.append(child.toQueryString(escaper));}return sb.toString();}
public void removeComment(Cell cell) {if (comment!= null) {cell.removeComment(comment);}}
public void reset() {arriving = -1;leaving = -1;}
public ActivateUserResult activateUser(ActivateUserRequest request) {request = beforeClientExecution(request);return executeActivateUser(request);}
public boolean isCharset() {return charset!= null;}
public ModifySnapshotCopyRetentionPeriodResult modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest request) {request = beforeClientExecution(request);return executeModifySnapshotCopyRetentionPeriod(request);}
public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) {request = beforeClientExecution(request);return executeDeleteClusterSubnetGroup(request);}
public static String decode(byte[] source) {return decode(source, 0, source.length);}
public int getDefaultPort() {return DEFAULT_PORT;}
public StopRunningTaskResult stopRunningTask(StopRunningTaskRequest request) {request = beforeClientExecution(request);return executeStopRunningTask(request);}
public void seekExact(BytesRef target, TermState otherState) {assert otherState!= null && otherState instanceof BlockTermState;assert!doOrd || ((BlockTermState) otherState).ord < numTerms;state.copyFrom(otherState);seekPending = true;indexIsCurrent = false;term.copyBytes(target);}
public SeriesToChartGroupRecord(RecordInputStream in) {field_1_chartType = in.readShort();}
public final void writeUnicodeString(int flag, byte[] data) {write(data, 0, data.length, flag);}
public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) {request = beforeClientExecution(request);return executeAuthorizeSecurityGroupIngress(request);}
public void addFile(FileObject file) {add(file, null);}
public HSSFImage(int width, int height) {this.width = width;this.height = height;}
public PrecedenceFilter(boolean suppressed) {super(suppressed);}
public LOOKIntervalSet(ATNState s, ATNState startState,int maxListeners,int minListeners, int maxListeners) {this.s = s;this.startState = startState;this.maxListeners = maxListeners;}
public void serialize(LittleEndianOutput out) {out.writeShort(getFirstRow());out.writeShort(getLastRow());out.writeByte(getFirstColumn());out.writeByte(getLastColumn());}
public Builder(boolean dedup) {this.dedup = dedup;}
public Hashtable(int capacity, int loadFactor) {this.loadFactor = loadFactor;this.capacity = capacity;this.loadFactor = loadFactor;}
public Object get(CharSequence key) {return trie.get(key);}
public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) {request = beforeClientExecution(request);return executeListHyperParameterTuningJobs(request);}
public DeleteTableResult deleteTable(DeleteTableRequest request) {request = beforeClientExecution(request);return executeDeleteTable(request);}
public boolean lessThan(Object o) {if (o instanceof StringFragments) {return getText(). compareTo((StringFragments) o);}return 0 < text.compareTo(0);}
public void freeBufferBefore(int position) {final int end = position + 1;System.arraycopy(buffer, start, buffer, 0, end);position = end;}
public UpdateHITTypeResult updateHITType(UpdateHITTypeRequest request) {request = beforeClientExecution(request);return executeUpdateHITType(request);}
public UpdateRecommenderConfigurationResult updateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request) {request = beforeClientExecution(request);return executeUpdateRecommenderConfiguration(request);}
public int compareTo(BytesRef other) {return Arrays.compareUnsigned(this.bytes, this.offset, this.offset + this.length,other.bytes, other.offset, other.offset + other.length);}
public int stem(final char s[], int len) {if (len < 4) return len;if (len > 5 && endsWith(s, len, "ища"))return len - 3;len = removeArticle(s, len);len = removePlural(s, len);if (len > 3) {if (endsWith(s, len, "я"))len--;if (endsWith(s, len, "а") ||endsWith(s, len, "о") ||endsWith(s, len, "е"))len--;}if (len > 4 && endsWith(s, len, "ен")) {s[len - 2] = 'н'; len--;}if (len > 5 && s[len - 2] == 'ъ') {s[len - 2] = s[len - 1];
public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) {request = beforeClientExecution(request);return executeDescribeDBSnapshots(request);}
public DummyFacetField(int dimension, String label, boolean isDummy) {this.dimension = dimension;this.label = label;this.isDummy = isDummy;}
public CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest request) {request = beforeClientExecution(request);return executeCreateDocumentationPart(request);}
public char[] getValue() {return value;}
public ShortBuffer asReadOnlyBuffer() {return duplicate();}
public UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest request) {request = beforeClientExecution(request);return executeUpdateDataSourcePermissions(request);}
public static org.apache.poi.hssf.record.Record createRecord(RecordInputStream in) {switch (in.remaining()) {case 2:return new Record(in);case 3:return new Record(in);}throw new RecordFormatException("Remaining record size (" + in.remaining() + ") is too big for HSSF records, try {return in.read();} catch (IOException e) {throw new RecordFormatException("Remaining record size (" + in.remaining() + ")", e);}}
public int getTabsCount() {return tabCount;}
public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) {request = beforeClientExecution(request);return executeDeleteApplicationReferenceDataSource(request);}
public CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest request) {request = beforeClientExecution(request);return executeCreateProjectVersion(request);}
public ShortBuffer slice() {byteBuffer.limit(limit * SizeOf.SHORT);byteBuffer.position(position * SizeOf.SHORT);ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());ShortBuffer result = new ShortToByteBufferAdapter(bb);byteBuffer.clear();return result;}
public final byte get() {if (position == limit) {throw new BufferUnderflowException();}return backingArray[offset + position++];}
public ByteBuffer putLong(int index, long value) {checkIndex(index, SizeOf.LONG);Memory.pokeLong(backingArray, offset + index, value, order);return this;}
public StoredField(String name, float value) {super(name, TYPE);fieldsData = value;}
public List<Token> getExpectedTokens() {return expectedTokens;}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public SubmoduleFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public void addIncludeMap(String name, RefMap includeMap) {if (includeMap.get(name) == null) {includeMap.put(name, includeMap.get(name));}includeMap.put(name, includeMap);}
public EnableSnapshotCopyResult enableSnapshotCopy(EnableSnapshotCopyRequest request) {request = beforeClientExecution(request);return executeEnableSnapshotCopy(request);}
public ValueFiller getValueFiller() {return new ValueFiller();}
public void serialize(LittleEndianOutput out) {out.writeShort(getRow());out.writeShort(getColumn());out.writeShort(getRow + 1);out.writeShort(getColumn());out.writeShort(getRow + 2);out.writeShort(getColumn());out.writeShort(getRow + 3);out.writeShort(getColumn());out.writeShort(getRow + 4);out.writeShort(getColumn());out.writeShort(getColumn());out.writeShort(getColumn());}
public static Counter newCounter() {return new Counter(false);}
public boolean get(String name, boolean dflt) {boolean vals[] = (boolean[]) valByRound.get(name);if (vals!= null) {return vals[roundNumber % vals.length];}String sval = props.getProperty(name, "" + dflt);if (sval.indexOf(":") < 0) {return Boolean.valueOf(sval).booleanValue();}int k = sval.indexOf(":");String colName = sval.substring(0, k);sval = sval.substring(k + 1);colForValByRound.put(name, colName);vals = propToBooleanArray(sval);valByRound.put(name, vals);return vals[roundNumber % vals.length];}
public void beforeSerialize() {field_1_index = 0;field_2_category = getRunData().getClass().getSimpleName();field_3_category_index = getRunData().getClass().getSimpleName();field_4_category_index = getRunData().getCategoryIndex();field_5_category_index = getRunData().getCategoryIndex();}
public ReuseStrategyResult reuseStrategy(ReuseStrategyRequest request) {request = beforeClientExecution(request);return executeReuseStrategy(request);}
public ExternalBookBlock(int numberOfSheets) {_externalBookRecord = new ExternalBookRecord();_externalBookRecord.setNumberOfSheets(numberOfSheets);}
public String toString() {return "SCREENENARIOPROTECT(" + "srini_string"; }
public PushCommand setThin(boolean thin) {this.thin = thin;return this;}
public int compareTo(ObjectType other) {long recordTimeSec = getRecordTimeSec(other);if (recordTimeSec!= null) {return recordTimeSec.compareTo(other);}else {return -1;}}
public ReverseStringFilter create(TokenStream input) {return new ReverseStringFilter(input, reverseString);}
public BlockList(int total) {this.blocks = new byte[total];this.offset = 0;this.length = 0;}
public Scorer(List<Term> terms) {this.terms = terms;}
public boolean equals(Object o) {return this.getClass() == o.getClass();}
public String getCharacterSet() {return characterSet;}
public DescribeExperimentResult describeExperiment(DescribeExperimentRequest request) {request = beforeClientExecution(request);return executeDescribeExperiment(request);}
public ESCHERGraphics createEscherGraphics() {return new EscherGraphics(new HSSFClientAnchor(HSSFClientAnchor.LEFT, HSSFClientAnchor.TOP, HSSFClientAnchor.BOTTOM, HSSFClientAnchor.LEFT, HSSFClientAnchor.TOP, HSSFClientAnchor.BOTTOM, HSSFClientAnchor.LEFT, HSSFClientAnchor.TOP);}
public String getPatternText() {return patternText;}
public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest request) {request = beforeClientExecution(request);return executeDeleteRouteTable(request);}
public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request) {request = beforeClientExecution(request);return executeAssociateVPCWithHostedZone(request);}
public PutIntegrationResult putIntegration(PutIntegrationRequest request) {request = beforeClientExecution(request);return executePutIntegration(request);}
public KeyValueEntry(byte key, byte value) {super(key);this.value = value;}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long byte0 = blocks[blocksOffset++] & 0xFF;final long byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte0 << 6) | (byte1 >>> 2);final long byte2 = blocks[blocksOffset++] & 0xFF;final long byte3 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 3) << 12) | (byte2 << 4) | (byte3 >>> 4);final long byte4 = blocks[blocksOffset++] & 0xFF;final long byte5 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte3 & 15) << 10) | (byte
public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) {request = beforeClientExecution(request);return executeDisassociateConnectionFromLag(request);}
public FileMode getOldMode() {return getOldMode(0);}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request) {request = beforeClientExecution(request);return executeStopKeyPhrasesDetectionJob(request);}
public String toFormulaString() {return FormulaError.REF.getString();}
public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request) {request = beforeClientExecution(request);return executeListDominantLanguageDetectionJobs(request);}
public String toString() {return "Slice " + sub + ": " + (start + start) + " " + ( end + start) + ")";}
public static Integer parseHexInt(byte[] in, int inStart, int inEnd) {byte[] b = new byte[4];b[0] = in[1];b[1] = in[2];b[2] = in[3];b[3] = in[4];b[4] = in[5];return parseHexInt(b, 0, b.length, false);}
public Attribute(String name, String value) {setName(name);setValue(value);}
public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetRequest request) {request = beforeClientExecution(request);return executeDescribeStackSetOperation(request);}
public HSSFCell getCell(int cellnum) {return getCell(cellnum, book.getMissingCellPolicy());}
public void writeBytes(byte[] b, int offset, int length) {assert b.length >= offset + length;if (length == 0) {return;}if (upto == blockSize) {if (currentBlock!= null) {addBlock(currentBlock);}currentBlock = new byte[blockSize];upto = 0;}final int offsetEnd = offset + length;while(true) {final int left = offsetEnd - offset;final int blockLeft = blockSize - upto;if (blockLeft < left) {System.arraycopy(b, offset, currentBlock, upto, blockLeft);addBlock(currentBlock);currentBlock = new byte[blockSize];upto = 0;offset += blockLeft;} else {System.arraycopy(b, offset, currentBlock, upto, left);upto += left;break;}}}
public ResetImageAttributeRequest(String imageId, String attribute) {setImageId(imageId);setAttribute(attribute);}
public void discardResultContents() {result = null;}
public ObjectId getPeeledObjectId() {return peeledObjectId;}
public void undeprecateDomain(UndeprecateDomainRequest request) {request = beforeClientExecution(request);executeUndeprecateDomain(request);}
public void write(LittleEndianOutput out) {out.writeShort(field_3_string);}
public DeleteQueueResult deleteQueue(DeleteQueueRequest request) {request = beforeClientExecution(request);return executeDeleteQueue(request);}
public void setPackFooter(boolean b) {this.packFooter = b;}
public void swap() {elements(1);elements(2);}
public long getPackedGitWindowSize() {return packedGitWindowSize;}
public UpdateApplicationMetricsResult updateApplicationMetrics(UpdateApplicationMetricsRequest request) {request = beforeClientExecution(request);return executeUpdateApplicationMetrics(request);}
public GetElebrityRecognitionResult getElbrityRecognition(GetElebrityRecognitionRequest request) {request = beforeClientExecution(request);return executeGetElebrityRecognition(request);}
public CreateQueueRequest(String queueName) {setQueueName(queueName);}
public Area3DPxg(int sheetIdentifier, int sheetRangeIdentifier) {this(sheetIdentifier, sheetRangeIdentifier);}
public void setBaselineTime(double baselineTime) {this.baselineTime = baselineTime;}
public MoveVpcAddressResult moveVpcAddress(MoveVpcAddressRequest request) {request = beforeClientExecution(request);return executeMoveVpcAddress(request);}
public String getLMName() {return LM_NAME;}
public GetTagsResult getTags(GetTagsRequest request) {request = beforeClientExecution(request);return executeGetTags(request);}
public AreaEval getOffset() {return this;}
public ShortBuffer put(short[] src, int srcOffset, int shortCount) {Arrays.checkOffsetAndCount(src.length, srcOffset, shortCount);if (shortCount > remaining()) {throw new BufferOverflowException();}for (int i = srcOffset; i < srcOffset + shortCount; ++i) {put(src[i]);}return this;}
public void init(String category) {this.category = category;}
public void write(int oneByte) throws IOException {checkWritePrimitiveTypes();primitiveTypes.write(oneByte);}
public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest request) {request = beforeClientExecution(request);return executeDescribeImportImageTasks(request);}
public ColumnInfoRecord(RecordInputStream in) {rt = in.readShort();grbitFrt = in.readShort();in.readFully(unused);}
public DiffCommand setStatus(int status, DiffInfo info) {this.status = info.getStatus();this.info = info;return this;}
public CreateExperimentResult createExperiment(CreateExperimentRequest request) {request = beforeClientExecution(request);return executeCreateExperiment(request);}
public UnknownRecord clone() {return copy();}
public FloatBuffer slice() {return new ReadWriteFloatArrayBuffer(remaining(), backingArray, offset + position);}
public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) {request = beforeClientExecution(request);return executeDescribeSnapshotSchedules(request);}
public DescribeImagesResult describeImages() {return describeImages(new DescribeImagesRequest());}
public Diff(Values values) {if (values == null) {throw new NullPointerException();}if (!(values instanceof Diff)) {throw new IllegalArgumentException();}this.values = values;}
public String toFormulaString(String[] operands) {StringBuilder buf = new StringBuilder();if(isExternalFunction()) {buf.append(operands[0]); appendArgs(buf, 1, operands);} else {buf.append(getName());appendArgs(buf, 0, operands);}return buf.toString();}
public LaboratingWorkbookEnvironment(WorkbookSession session) {session = session;}
public ListPhotoTagsRequest() {super("CloudPhoto", "2017-07-11", "ListPhotoTags", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public RandomSamplingFacetsCollector(Configuration configuration) {super(configuration);}
public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) {request = beforeClientExecution(request);return executeAllocateStaticIp(request);}
public FeatRecord(RecordInputStream in) {field_1_year = in.readInt();field_2_row_active_cell = in.readInt();field_3_col_active_cell = in.readInt();field_4_active_cell_ref = in.readInt();field_5_active_cell_ref = in.readInt();field_6_unknown_cell_ref = in.readInt();}
public CherryPickMergeResult merge(MergeRequest request) {request = beforeClientExecution(request);return executeMerge(request);}
public SnapshotSchedule create(CreateSnapshotScheduleRequest request) {request = beforeClientExecution(request);return executeCreateSnapshotSchedule(request);}
public Record nextRecord() {Record r;r = getNextUnreadRecord();if (r!= null) {return r;}while (true) {if (!_recStream.hasNextRecord()) {return null;}if (_lastRecordWasEOFLevelZero) {if (_recStream.getNextSid()!= BOFRecord.sid) {return null;}}_recStream.nextRecord();r = readNextRecord();if (r == null) {continue;}return r;}}
public String toString() {return buf.toString();}
public ListTablesRequest(String exclusiveStartTableName, Integer limit) {setExclusiveStartTableName(exclusiveStartTableName);setLimit(limit);}
public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) {request = beforeClientExecution(request);return executeEnableAlarmActions(request);}
public Builder() {this(true);}
public boolean equals(Object o) {if (!(o instanceof State)) return false;State other = (State)o;return Arrays.equals(states, other.states);}
public TokenStream create(TokenStream input) {return new EnglishPossessiveFilter(input);}
public void clear() {chars = new char[0];}
public int get(int index, long[] arr, int off, int len) {int j = off + index;int k = k;for (int i = 0; i < j; i++) {get(i, arr, arr, k);}return k;}
public DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest request) {request = beforeClientExecution(request);return executeDeleteRouteResponse(request);}
public String toPrivateString() {return super.toPrivateString();}
public CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest request) {request = beforeClientExecution(request);return executeCreatePresignedDomainUrl(request);}
public void writeChar(int value) throws IOException {checkWritePrimitiveTypes();primitiveTypes.writeShort(value);}
public SSTRecord getSSTRecord() {return sst;}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public BloomFilter saturatedBloomFilter(SaturatedBloomFilter request) {request = beforeClientExecution(request);return executeSaturatedBloomFilter(request);}
public void setIgnoreCase(boolean b) {this.ignoreCase = b;}
public String toString(String field) {StringBuilder buffer = new StringBuilder();buffer.append("(");for (int i = 0 ; i < disjuncts.length; i++) {Query subquery = disjuncts[i];if (subquery instanceof BooleanQuery) {   buffer.append("(");buffer.append(subquery.toString(field));buffer.append(")");}else buffer.append(subquery.toString(field));if (i!= disjuncts.length-1) buffer.append(" | ");}buffer.append(")");if (tieBreakerMultiplier!= 0.0f) {buffer.append("~");buffer.append(tieBreakerMultiplier);}return buffer.toString();}
public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) {request = beforeClientExecution(request);return executeDeleteDataSource(request);}
public RebootNodeResult rebootNode(RebootNodeRequest request) {request = beforeClientExecution(request);return executeRebootNode(request);}
public void convertRawChildRecordsToEscherRecords(EscherRecord[] childRecords) {for (EscherRecord childRecord : childRecords) {childRecord.convertRawToEscherRecords();}}
public CreateTagsResult createTags(CreateTagsRequest request) {request = beforeClientExecution(request);return executeCreateTags(request);}
public long getFilePointer() {return snapshot;}
public InputStream getResourceAsStream(String resource) throws IOException {return resource.getInputStream();}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public int nextIndex() {return pos + 1;}
public CharSequence toQueryString(EscapeQuerySyntax escaper) {if (isDefaultField(this.field)) {return this.text;} else {return this.field + ":" + this.text;}}
public BottomMarginRecord clone() {return copy();}
public boolean isOutput() {return true;}
public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest request) {request = beforeClientExecution(request);return executeCreateNetworkInterface(request);}
public void serialize(LittleEndianOutput out) {out.writeShort(password);}
public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request) {request = beforeClientExecution(request);return executeStopDominantLanguageDetectionJob(request);}
public void setConnectTimeout(long connectionTimeout) {if (connectionTimeout < 0)throw new IllegalArgumentException(JGitText.get().connectionTimeoutMustBeNonNegative);this.connectionTimeout = connectionTimeout;}
public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest request) {request = beforeClientExecution(request);return executeGetGatewayGroup(request);}
public ShortBuffer slice() {byteBuffer.limit(limit * SizeOf.SHORT);byteBuffer.position(position * SizeOf.SHORT);ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());ShortBuffer result = new ShortToByteBufferAdapter(bb);byteBuffer.clear();return result;}
public static String join(String separator, String lastSeparator) {StringBuilder sb = new StringBuilder();for (int i = 0; i < strings.size(); i++) {String s = strings.get(i).toString();if (s.length()==0 || s.length()==0 - 1) {sb.append(lastSeparator);}sb.append(separator);}sb.append(lastSeparator);return sb.toString();}
public String toString() {return "(" + a.toString() + " AND " + b.toString() + ")";}
public ListSubscriptionsByTopicRequest(String topicArn) {setTopicArn(topicArn);}
public byte readByte() {return (byte) readUByte();}
public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) {request = beforeClientExecution(request);return executeTerminateClientVpnConnections(request);}
public SendMessageRequest(String queueUrl) {setQueueUrl(queueUrl);}
public void serialize(LittleEndianOutput out) {out.writeShort(getRowNumber());out.writeShort(getFirstCol() == -1? (short)0 : getFirstCol());out.writeShort(getLastCol() == -1? (short)0 : getLastCol());out.writeShort(getHeight());out.writeShort(getOptimize());out.writeShort(field_6_reserved);out.writeShort(getOptionFlags());out.writeShort(getOptionFlags2());}
public static double common(Output out, Output out) {double d = out.getDouble() - out.getDouble();if (d == 0) {d = 0;} else if (d == 0) {d = -1;} else if (d == 1) {d = 1;} else if (d == 2) {d = 2;} else if (d == 3) {d = 4;} else if (d == 4) {d = 5;} else if (d == 5) {d = 6;} else if (d == 6) {d = 7;}else if (d == 7) {d = 8;}else if (d == 8) {d = 9;}else if (d == 10) {d = 10;} else if (d == 14)) {d = 22;}else if (d == 21) {d = 21;else if (d == 22) {return;}}return d;}
public CreateVariableResult createVariable(CreateVariableRequest request) {request = beforeClientExecution(request);return executeCreateVariable(request);}
public static final int indexOf(byte[] src, int pos, int len) {if (ptr == src.length)return DONE;else {for (int i = 0; i < len; i++) {if (src[i]!= 0) return i;}}}return -1;}
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {int bytesRemaining = readHeader( data, offset );int pos            = offset + 8;int size           = 0;field_1_color1 =  LittleEndian.getInt( data, pos + size );size+=4;field_2_color2 =  LittleEndian.getInt( data, pos + size );size+=4;field_3_color3 =  LittleEndian.getInt( data, pos + size );size+=4;field_4_color4 =  LittleEndian.getInt( data, pos + size );size+=4;bytesRemaining -= size;if (bytesRemaining!= 0) {throw new RecordFormatException("Expecting no remaining data but got " + bytesRemaining + " byte(s).");}return 8 + size + bytesRemaining;}
public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request) {request = beforeClientExecution(request);return executeCreateCloudFrontOriginAccessIdentity(request);}
public boolean isNamespaceAware() {return false;}
public void setOverride(boolean on) {override(on? 1 : 0);}
public String toString() {return getClass().getName();}
public IndexReader getIndexReader() {return indexReader;}
public int indexOfKey(int key) {if (mGarbage) {gc();}return binarySearch(mKeys, 0, mSize, key);}
public BlankRecord(RecordInputStream in) {_reserved = in.readShort();}
public long length() {return length;}
public PasswordRecord(RecordInputStream in) {field_1_password = in.readShort();}
public HashMap(int capacity, int loadFactor) {if (capacity < 0) {capacity = Integer.MAX_VALUE;loadFactor = 1;} else if (capacity > 0) {loadFactor = capacity;} else {loadFactor = loadFactor;}resize(capacity);return new HashMap(loadFactor);}
public void run() {try {main();} catch (Exception e) {throw new RuntimeException(e);}}
public DeleteLoginProfileResult deleteLoginProfile(DeleteLoginProfileRequest request) {request = beforeClientExecution(request);return executeDeleteLoginProfile(request);}
public E pollFirst() {return (E) deque.peekFirstElement();}
public CreateCloudPhotoResult createCloudPhoto(CreateCloudPhotoRequest request) {request = beforeClientExecution(request);return executeCreateCloudPhoto(request);}
public String toString() {return "Resolver";}
public int findEndBoundary(StringBuilder buffer, int start) {if( start > buffer.length() || start < 1 || start > buffer.length() || start > buffer.length() - end) {return buffer.length() - end;} int foundBoundary = start;for (int i = start; i < end; i++) {if( boundaryChars.contains(buffer.charAt(i)) ) {return i;}}boundaryChars[foundBoundary] = true;return foundBoundary;}
public void setObjectChecker(ObjectChecker checker) {this.checker = checker;}
public AreaEval(AreaEval base, int sheetIndex, int baseOffset) {this.baseOffset = baseOffset;this.baseOffset = baseOffset;}
public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) {request = beforeClientExecution(request);return executeCreateVpcEndpoint(request);}
public DeregisterWorkspaceDirectoryResult deregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request) {request = beforeClientExecution(request);return executeDeregisterWorkspaceDirectory(request);}
public ChartFRTInfoRecord(RecordInputStream in) {field_1_id = in.readInt();field_2_type = in.readInt();field_3_sheet_index = in.readInt();field_4_format = in.readInt();}
public Merger newMerger(Repository db, boolean inCore) {return new OneSide(db, treeIndex);}
public CreateDataSourceFromClusterResult createDataSourceFromCluster(CreateDataSourceFromClusterRequest request) {request = beforeClientExecution(request);return executeCreateDataSourceFromCluster(request);}
public DecisionToDFAArray() {decisionToDFA = null;}
public void removeName(String name) {int idx = indexOfName(name);if (idx!= -1) {names.remove(idx);}}
public String toStringRightMargin() {return "RIGHT MARGIN:" + rightMargin;}
public DefaultColWidthRecord clone() {return copy();}
public void addProcessors(Map<String, String> processors) {this.processors = processors;}
public String formatCellRefAsString() {return formatCellRefAsString();}
public ByteBuffer put(int index, byte b) {checkIndex(index);backingArray[offset + index] = b;return this;}
public void setMode(String mode) {mode = mode;}
public ShortBuffer slice() {byteBuffer.limit(limit * SizeOf.SHORT);byteBuffer.position(position * SizeOf.SHORT);ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());ShortBuffer result = new ShortToByteBufferAdapter(bb);byteBuffer.clear();return result;}
public void set(int index, int value) {if (count < index)throw new ArrayIndexOutOfBoundsException(index);else if (count == index)add(value);elseentries[index] = value;}
public ByteBuffer putFloat(float value) {throw new ReadOnlyBufferException();}
public static double max(double[] values) {double max = Double.POSITIVE_INFINITY;for (double value : values) {max = Math.max(max, value);}return max;}
public CreateWebhookRequest() {super("cr", "2016-06-07", "CreateWebhook", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]");setMethod(MethodType.PUT);}
public DeleteAttributesRequest(String domainName, String itemName, java.util.List<Attribute> attributes) {setDomainName(domainName);setItemName(itemName);setAttributes(attributes);}
public String toFormulaString(String[] operands) {StringBuilder buf = new StringBuilder();if(isExternalFunction()) {buf.append(operands[0]); appendArgs(buf, 1, operands);} else {buf.append(getName());appendArgs(buf, 0, operands);}return buf.toString();}
public boolean wasMergedRebaseed() {return wasMergedRebaseed();}
public BytesRef(byte[] bytes, int offset, int len) {this.bytes = bytes;this.offset = offset;this.len = len;}
public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) {request = beforeClientExecution(request);return executeDescribeConnections(request);}
public DeletePhotosRequest() {super("CloudPhoto", "2017-07-11", "DeletePhotos", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public synchronized boolean add(E object) {if (elementCount == elementData.length) {growByOne();}elementData[elementCount++] = object;modCount++;return true;}
public static ByteBuffer readOnly(int capacity) {if (capacity < 0) {throw new IllegalArgumentException();}return new ReadWriteByteBuffer(capacity);}
public SrndQuery getSubQuery(int index) {return subQueries[index];}
public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) {if (numPayloadsSeen == 0) {return currentPayloadScore;} else {return Math.max(currentPayloadScore, currentScore);}}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[USESELFS]\n");buffer.append("   .options = ").append(HexDump.shortToHex(_options)).append("\n");buffer.append("[/USESELFS]\n");return buffer.toString();}
public GetLogPatternResult getLogPattern(GetLogPatternRequest request) {request = beforeClientExecution(request);return executeGetLogPattern(request);}
public RegisterTransitGatewayMulticastGroupMembersResult registerTransitGatewayMulticastGroupMembers(RegisterTransitGatewayMulticastGroupMembersRequest request) {request = beforeClientExecution(request);return executeRegisterTransitGatewayMulticastGroupMembers(request);}
public GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest request) {request = beforeClientExecution(request);return executeGetPhoneNumber(request);}
public byte[] getData() throws IOException {return data;}
public final boolean isDirect() {return false;}
public DeleteServerCertificateResult deleteServerCertificate(DeleteServerCertificateRequest request) {request = beforeClientExecution(request);return executeDeleteServerCertificate(request);}
public StringBuilder append(double d) {RealToString.getInstance().appendDouble(this, d);return this;}
public GetEvaluationResult getEvaluation(GetEvaluationRequest request) {request = beforeClientExecution(request);return executeGetEvaluation(request);}
public LinkDataRecord getName() {return linkDataRecord;}
public boolean lookingAt() {matchFound = lookingAtImpl(address, input, matchOffsets);if (matchFound) {findPos = matchOffsets[1];}return matchFound;}
public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request) {request = beforeClientExecution(request);return executeGetLifecyclePolicyPreview(request);}
public TokenStream createTokenStream(String singleWord) {return new TokenStream(singleWord.toCharArray(), 0, singleWord.length());}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_print_headers);}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public PushCommand setRemote(String remote) {checkCallable();this.remote = remote;return this;}
public CollapsesRowResult collapsesRow(CollapsesRowRequest request) {request = beforeClientExecution(request);return executeCollapsesRow(request);}
public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) {request = beforeClientExecution(request);return executeAssociateSkillGroupWithRoom(request);}
public String toString(){StringBuilder buffer = new StringBuilder();buffer.append("[SURT]\n");buffer.append("   .chartGroupIndex      = ").append("0x").append(HexDump.toHex(  getChartGroupIndex ())).append(" (").append( getChartGroupIndex() ).append(" )");buffer.append(System.getProperty("line.separator"));buffer.append("[/SURT]\n");return buffer.toString();}
public QueryConfigHandler getQueryConfigHandler() {return queryConfigHandler;}
public String toString() {return classArgument.getName();}
