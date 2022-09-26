public DVRecord(RecordInputStream in) {field_1_dv = in.readShort();}
public String toString() {return super.toString() + "(\"" + pattern.pattern() + "\")";}
public InsertInstanceRequest() {super("cr", "2016-06-07", "InsertInstance", "cr");setUriPattern("/users/[User]/instances/[InstanceId]");setMethod(MethodType.POST);}
public boolean contains(Object o) {return containsValue(o);}
public static ByteBuffer encodeBase64(String str) {return Base64.getEncoder().encode(str);}
public boolean requiresCommitBody() {return false;}
public String getKey() {return key;}
public ValueEval evaluate(ValueEval[] args, int srcRow, int srcCol) {int nFrames = 0;for (int i = 0; i < args.length; i++) {double d = NumericFunction.singleOperandEvaluate(args[i], srcRow, srcCol);if (d == 0.0) {return ErrorEval.VALUE_INVALID;}nFrames++;}return nFrames;}
public DeleteClientVpnEndpointResult deleteClientVpnEndpoint(DeleteClientVpnEndpointRequest request) {request = beforeClientExecution(request);return executeDeleteClientVpnEndpoint(request);}
public Object get(CharSequence key) {return trie.get(key);}
public StartFleetActionsResult startFleetActions(StartFleetActionsRequest request) {request = beforeClientExecution(request);return executeStartFleetActions(request);}
public CellRangeAddress getAreaAt(int index) {return _regions[_startIndex + index];}
public static Document loadXML(Reader is) {DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();DocumentBuilder db = null;try {db = dbf.newDocumentBuilder();}catch (Exception se) {throw new RuntimeException("Parser configuration error", se);}org.w3c.dom.Document doc = null;try {doc = db.parse(new InputSource(is));}catch (Exception se) {throw new RuntimeException("Error parsing file:" + se, se);}return doc;}
public double get(String name, double dflt) {double vals[] = (double[]) valByRound.get(name);if (vals!= null) {return vals[roundNumber % vals.length];}String sval = props.getProperty(name, "" + dflt);if (sval.indexOf(":") < 0) {return Double.parseDouble(sval);}int k = sval.indexOf(":");String colName = sval.substring(0, k);sval = sval.substring(k + 1);colForValByRound.put(name, colName);vals = propToDoubleArray(sval);valByRound.put(name, vals);return vals[roundNumber % vals.length];}
public String getBackgroundImageId() {return this.backgroundImageId;}
public TreeFilter getTreeFilter() {return treeFilter;}
public GetMemberResult getMember(GetMemberRequest request) {request = beforeClientExecution(request);return executeGetMember(request);}
public boolean canEncode() {return true;}
public ReplaceRouteResult replaceRoute(ReplaceRouteRequest request) {request = beforeClientExecution(request);return executeReplaceRoute(request);}
public ObjectId getResultTreeId() {return resultTree;}
@Override public boolean equals(Object object) {synchronized (mutex) {return list.equals(object);}}
public ListReusableDelegationSetsResult listReusableDelegationSets() {return listReusableDelegationSets(new ListReusableDelegationSetsRequest());}
public String toString() {return "(" + a.toString() + " OR " + b.toString() + ")";}
public InitiateLayerUploadResult initiateLayerUpload(InitiateLayerUploadRequest request) {request = beforeClientExecution(request);return executeInitiateLayerUpload(request);}
public UpdateRepoRequest() {super("cr", "2016-06-07", "UpdateRepo", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/updates");setMethod(MethodType.POST);}
public PhoneticFilterFactory(Map<String,String> args) {super(args);dictionaryFile = get(args, "dictionary");ignoreCase = getBoolean(args, "ignoreCase", false);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public FetchCommand fetch() {return new FetchCommand(repo);}
public QueryPhraseMap searchPhrase( final List<TermInfo> phraseCandidate ){QueryPhraseMap currMap = this;for( TermInfo ti : phraseCandidate ){currMap = currMap.subMap.get( ti.getText() );if( currMap == null ) return null;}return currMap.isValidTermOrPhrase( phraseCandidate )? currMap : null;}
@Override public Iterator<Multiset.Entry<E>> iterator() {final Iterator<Map.Entry<E, Integer>> backingIterator= countMap.entrySet().iterator();return new Iterator<Multiset.Entry<E>>();}
public DeleteDBSnapshotResult deleteDBSnapshot(DeleteDBSnapshotRequest request) {request = beforeClientExecution(request);return executeDeleteDBSnapshot(request);}
public DiffCommand setOutput(boolean output) {this.output = output;return this;}
public LongBuffer compact() {throw new ReadOnlyBufferException();}
public XmlPullParserFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public DeleteAnalysisSchemeResult deleteAnalysisScheme(DeleteAnalysisSchemeRequest request) {request = beforeClientExecution(request);return executeDeleteAnalysisScheme(request);}
public HSSFWorkbookExtractor(HSSFWorkbook workbook) {this(workbook, null);}
public IntBuffer put(int index, int c) {checkIndex(index);byteBuffer.putInt(index * SizeOf.INT, c);return this;}
public int getParameterClass(int index) {return mParameters.get(index);}
public ListEndpointsResult listEndpoints(ListEndpointsRequest request) {request = beforeClientExecution(request);return executeListEndpoints(request);}
public CharsRef join(String[] words) {return join(words, CharsRef.EMPTY);}
public FloatBuffer insert(int index, float c) {checkIndex(index);byteBuffer.putFloat(index * SizeOf.FLOAT, c);return this;}
public ShortBuffer put(short[] src, int srcOffset, int shortCount) {if (shortCount > remaining()) {throw new BufferOverflowException();}System.arraycopy(src, srcOffset, backingArray, offset + position, shortCount);position += shortCount;return this;}
public DisassociateResolverEndpointIpResult disassociateResolverEndpointIp(DisassociateResolverEndpointIpRequest request) {request = beforeClientExecution(request);return executeDisassociateResolverEndpointIp(request);}
public AcceptDirectConnectGatewayAssociationProposalResult acceptDirectConnectGatewayAssociationProposal(AcceptDirectConnectGatewayAssociationProposalRequest request) {request = beforeClientExecution(request);return executeAcceptDirectConnectGatewayAssociationProposal(request);}
public StopStackOperationResult stopStackOperation(StopStackOperationRequest request) {request = beforeClientExecution(request);return executeStopStackOperation(request);}
public CacheSubnetGroup createCacheSubnetGroup(CreateCacheSubnetGroupRequest request) {request = beforeClientExecution(request);return executeCreateCacheSubnetGroup(request);}
public OrdinalCache(Reader input) {ordinals = input.getOrdinals();if (ordinals == null) {ordinals = DEFAULT_ORDS.getOrdinals();}int pos = 0;for (int i = 0; i < ordinals.length; i++) {int h = ordinals[i].ordinal();if (h < 0) {pos += h;}}return new OrdinalCache(ordinals, pos, h);}
public String getRawUserInfo() {return rawUserInfo;}
public Object[] toArray() {return elements.clone();}
public DescribeCompilationJobResult describeCompilationJob(DescribeCompilationJobRequest request) {request = beforeClientExecution(request);return executeDescribeCompilationJob(request);}
public String getQuery() {return decode(query);}
public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest request) {request = beforeClientExecution(request);return executeCreateEnvironment(request);}
public boolean matches(ParseTree tree) {return matchTree(tree, 0);}
public boolean containsKey(CharSequence cs) {if(cs == null)throw new NullPointerException();return false;}
public QueryParser(String tableName) {this.tableName = tableName;}
public boolean isRowGroupHiddenByParent(short rowGroupNumber) {return rowGroupNumber < 0;}
public void retryFailedLockFileCommit(Exception lockException) {if (lockException == null)throw new IllegalArgumentException(lockString.equals(exception.getMessage()))throw new IllegalArgumentException(lockException.getMessage());}
public ValidateMatchmakingRuleSetResult validateMatchmakingRuleSet(ValidateMatchmakingRuleSetRequest request) {request = beforeClientExecution(request);return executeValidateMatchmakingRuleSet(request);}
public boolean get(String name, boolean dflt) {boolean vals[] = (boolean[]) valByRound.get(name);if (vals!= null) {return vals[roundNumber % vals.length];}String sval = props.getProperty(name, "" + dflt);if (sval.indexOf(":") < 0) {return Boolean.valueOf(sval).booleanValue();}int k = sval.indexOf(":");String colName = sval.substring(0, k);sval = sval.substring(k + 1);colForValByRound.put(name, colName);vals = propToBooleanArray(sval);valByRound.put(name, vals);return vals[roundNumber % vals.length];}
public UpdateLinkAttributesResult updateLinkAttributes(UpdateLinkAttributesRequest request) {request = beforeClientExecution(request);return executeUpdateLinkAttributes(request);}
public NumericPayloadFilter(TokenStream input) {while (input.hasNext()) {if (input.nextToken()==Token.Type.NUMERIC_PAYLOAD) {nextToken = input.nextToken();} else {if (input.hasNext()) {while (input.hasNext()) {while (input.hasNext()) {if (input.nextToken()==Token.Type.NUMERIC_PAYLOAD) {input.nextToken();}}}}return input;} else {while (true) {if (input.hasNext()) {if (input.hasNext()) {if (input.nextToken()==Token.Type.NUMERIC_PAYLOAD) {nextToken = input.nextToken();}}}return null;}}
public String toFormulaString(String[] operands) {StringBuilder buf = new StringBuilder();if(isExternalFunction()) {buf.append(operands[0]); appendArgs(buf, 1, operands);} else {buf.append(getName());appendArgs(buf, 0, operands);}return buf.toString();}
public void push(E object) {throw new IllegalStateException();}
public LinkedHashMap(int initialCapacity, int loadFactor) {super(initialCapacity);this.loadFactor = loadFactor;}
public final void setBackedMap(Map<K, V> newBackedMap) {backedMap = newBackedMap;}
public synchronized long skip(long charCount) {if (charCount <= 0) {return 0;}int numskipped;if (this.count - pos < charCount) {numskipped = this.count - pos;pos = this.count;} else {numskipped = (int) charCount;pos += charCount;}return numskipped;}
public ValueEval Ref3DPxg(int srcRowIndex, int srcColumnIndex, int dstColumnIndex) {this.srcRowIndex = srcRowIndex;this.srcColumnIndex = srcColumnIndex;this.dstRowIndex = dstRowIndex;this.dstColumnIndex = dstColumnIndex;}
public AnalyzerTask() {super(true);}
public boolean equals( Object o ) {return o instanceof EnglishStemmer;}
public void decode(long[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long block = blocks[blocksOffset++];for (int shift = 48; shift >= 0; shift -= 16) {values[valuesOffset++] = (block >>> shift) & 65535;}}}
public int IncRef() {if (!initDone) {initDone = true;} else {assert count > 0: Thread.currentThread().getName() + ": RefCount is 0 pre-increment for file \"" + fileName + "\"";}return ++count;}
public TestFailoverForReplicationGroupResult testFailoverForReplicationGroup(TestFailoverForReplicationGroupRequest request) {request = beforeClientExecution(request);return executeTestFailoverForReplicationGroup(request);}
public static Collection<Ref> sort(Collection<Ref> refs) {final List<Ref> r = new ArrayList<>(refs);Collections.sort(r, INSTANCE);return r;}
public Vector(int capacity, int capacityIncrement) {if (capacity < 0) {throw new IllegalArgumentException("Capacity: " + capacity);}if (capacity < 0) {throw new IllegalArgumentException("Capacity: " + capacity);}if (capacity == 0) {throw new IllegalArgumentException("Capacity: " + capacity);}this.capacity = capacity;this.capacityIncrement = capacityIncrement;this.capacityDecrement = 0;}
public void endWorker() {if (!isMainThread())throw new IllegalStateException();pm.endWorker();}
public DescribeVolumeStatusResult describeVolumeStatus(DescribeVolumeStatusRequest request) {request = beforeClientExecution(request);return executeDescribeVolumeStatus(request);}
public IntMapper(int initialCapacity) {entries = new int[initialCapacity];}
public void serialize() {field_1_border_type = field_1_border_type;field_1_border_options = field_2_border_options;}
public final ByteBuffer get(long[] dst) {return get(dst, 0, dst.length);}
public ValueEval evaluate(String sheetName, int rowIndex, int columnIndex) {EvaluationCell cell = _sewb.getEvaluationCell(sheetName, rowIndex, columnIndex);switch (cell.getCellType()) {case BOOLEAN:return BoolEval.valueOf(cell.getBooleanCellValue());case ERROR:return ErrorEval.valueOf(cell.getErrorCellValue());case FORMULA:return _evaluator.evaluate(cell);case NUMERIC:return new NumberEval(cell.getNumericCellValue());case STRING:return new StringEval(cell.getStringCellValue());case BLANK:return null;default:throw new IllegalStateException("Bad cell type (" + cell.getCellType() + ")");}}
public PageSettingsBlock add(PageSettings block) {this(block, null);}
public DeleteSignalingChannelResult deleteSignalingChannel(DeleteSignalingChannelRequest request) {request = beforeClientExecution(request);return executeDeleteSignalingChannel(request);}
public boolean remove(Object o) {if (!(o instanceof Map.Entry))return false;Map.Entry<?,?> e = (Map.Entry<?,?>)o;return ConcurrentHashMap.this.remove(e.getKey(), e.getValue());}
public PersistentSnapshotDeletionPolicy(IndexDeletionPolicy primary,Directory dir, OpenMode mode) throws IOException {super(primary);this.dir = dir;if (mode == OpenMode.CREATE) {clearPriorSnapshots();}loadPriorSnapshots();if (mode == OpenMode.APPEND && nextWriteGen == 0) {throw new IllegalStateException("no snapshots stored in this directory");}}
public void throwException(Throwable e) {throw new RuntimeException(e);}
public String(BytesRef input, int offset, int len) {byte[] buf = new byte[(int) (input.getLEN() + 6), (int) (input.getLen() + 6), (int) (input.getLen() + 7), (int) (input.getLen() + 8), (input.getLen() + 9), (input.getLen() + 10), (input.getPos() + 8), (input.getPos() + input.getPos() + input.getPos() + input.getCharPos()));byte[] buf = new byte[(int)(input.getLen() + input.getPos() + input.getLen() + 10), (input.getPos() + input.getCharPos() + input.getCharPos() + input.getCharPos() + input.getCharPos() + input.getCharPos() )));System.arraycopy(buf, 0, input.setPos() + input.getPos() + input.getCharPos() + input.getCharPos() + input.getPos()
public GetPublicAccessUrlsRequest() {super("industry-brain", "2018-07-12", "GetPublicAccessUrls");setProtocol(ProtocolType.HTTPS);}
public CleanCommand clean() {return new CleanCommand(repo);}
public Collection<String> getAllPackFiles(){Collection<String> files = new TreeSet<>();for (Map.Entry<String,String> entry : packFiles) {files.add(entry.getKey());}return Collections.unmodifiableCollection(files);}
public DescribeStackDriftDetectionResult describeStackDriftDetection(DescribeStackDriftDetectionRequest request) {request = beforeClientExecution(request);return executeDescribeStackDriftDetection(request);}
public ListOriginAccessIdentitiesResult listOriginAccessIdentities(ListOriginAccessIdentitiesRequest request) {request = beforeClientExecution(request);return executeListOriginAccessIdentities(request);}
public static Factory<String> getInstance(String factoryClass) {try {return forName(factoryClass);} catch (Exception e) {throw new RuntimeException(e);}}
public ListConferenceProvidersResult listConferenceProviders(ListConferenceProvidersRequest request) {request = beforeClientExecution(request);return executeListConferenceProviders(request);}
public UpdateReceiptRuleResult updateReceiptRule(UpdateReceiptRuleRequest request) {request = beforeClientExecution(request);return executeUpdateReceiptRule(request);}
public String toString() {final StringBuilder r = new StringBuilder();r.append("(");for (int i = 0; i < subfilters.length; i++) {if (i > 0)r.append(" AND ");r.append(subfilters[i].toString());}r.append(")");return r.toString();}
public void serialize(LittleEndianOutput out) {out.writeShort(sid);out.writeShort(_cbFContinued);if (_linkPtg == null) {out.writeShort(0);} else {int formulaSize = _linkPtg.getSize();int linkSize = formulaSize + 6;if (_unknownPostFormulaByte!= null) {linkSize++;}out.writeShort(linkSize);out.writeShort(formulaSize);out.writeInt(_unknownPreFormulaInt);_linkPtg.write(out);if (_unknownPostFormulaByte!= null) {out.writeByte(_unknownPostFormulaByte.intValue());}}out.writeShort(_cLines);out.writeShort(_iSel);out.writeShort(_flags);out.writeShort(_idEdit);if(_dropData!= null) {_dropData.serialize(out);}if(_rgLines!=
public UpdateHealthCheckResult updateHealthCheck(UpdateHealthCheckRequest request) {request = beforeClientExecution(request);return executeUpdateHealthCheck(request);}
public synchronized long ramBytesUsed() {long bytes = 0;for(CachedOrds ords : ordsCache.values()) {bytes += ords.ramBytesUsed();}return bytes;}
public UpdateWorkforceResult updateWorkforce(UpdateWorkforceRequest request) {request = beforeClientExecution(request);return executeUpdateWorkforce(request);}
public void setObjectId(RevObject obj) {setObjectId(obj, obj.getType());}
public void write(byte[] buffer, int byteOffset, int byteCount) throws IOException {checkWritePrimitiveTypes();primitiveTypes.write(buffer, byteOffset, byteCount);}
public DescribeBlockResult describeBlock(DescribeBlockRequest request) {request = beforeClientExecution(request);return executeDescribeBlock(request);}
public void addDirectory(File base, String name) {checkCallable();if (base == null) {throw new IllegalArgumentException("base must not be null");}if (exportBase == null) {throw new IllegalArgumentException("base must not be null");}this.exportBase = base;this.name = name;}
public CreateReservedInstancesResult createReservedInstances(CreateReservedInstancesRequest request) {request = beforeClientExecution(request);return executeCreateReservedInstances(request);}
public ByteBuffer put(byte b) {if (position == limit) {throw new BufferOverflowException();}byteBuffer.put(b, b & 0xFF);position ++;return this;}
public ValueEval evaluate(ValueEval[] args, int srcCellRow, int srcCellCol) {switch (args.length) {case 1:return evaluate(srcCell, srcCellRow, srcCellCol);case 2:return evaluate(srcCell, srcCellCol, srcCellCol);case 3:return evaluate(srcCell, srcCellCol, srcCellCol);case 4:return evaluate(srcCell, srcCellCol, srcCellCol);case 5:return evaluate(srcCell, srcCellCol, srcCellCol, srcCellCol);case 6:return evaluate(srcCell, srcCellCol, srcCellCol, srcCellCol, srcCellCol, srcCellCol);case 3:return evaluate(srcCell, srcCellCol, srcCellCol, srcCellColCol, srcCellColCol, srcCellCol);}return ErrorEval.VALUE_INVALID;}
public StopJumpServerRequest() {super("cr", "2016-06-07", "StopJumpServer", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/tags/[Tag]/jumpserver");setMethod(MethodType.POST);}
public CreateDirectoryConfigResult createDirectoryConfig(CreateDirectoryConfigRequest request) {request = beforeClientExecution(request);return executeCreateDirectoryConfig(request);}
public DescribeExportTasksResult describeExportTasks() {return describeExportTasks(new DescribeExportTasksRequest());}
public ExportClientVpnClientCertificateRevocationListResult exportClientVpnClientCertificateRevocationList(ExportClientVpnClientCertificateRevocationListRequest request) {request = beforeClientExecution(request);return executeExportClientVpnClientCertificateRevocationList(request);}
public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest request) {request = beforeClientExecution(request);return executeCompleteMultipartUpload(request);}
public long ramBytesUsed() {long ramBytesUsed = postingsReader.ramBytesUsed();for (TermsReader r : fields.values()) {ramBytesUsed += r.ramBytesUsed();}return ramBytesUsed;}
public static void fill(float[] array, float value) {for (int i = 0; i < array.length; i++) {array[i] = value;}}
public DoubleBuffer put(int index, double c) {checkIndex(index);byteBuffer.putDouble(index * SizeOf.DOUBLE, c);return this;}
public DescribeAdjustmentTypesResult describeAdjustmentTypes(DescribeAdjustmentTypesRequest request) {request = beforeClientExecution(request);return executeDescribeAdjustmentTypes(request);}
public PersonIdent getSourceAuthor() {return source.getAuthorIdent();}
public Object[] toArray() {return elements;}
public String toString() {StringBuilder sb = new StringBuilder();sb.append(getClass().getName());sb.append(" [");if (externalWorkbookNumber >= 0) {sb.append(" [");sb.append("workbook=").append(getExternalWorkbookNumber());sb.append("] ");}sb.append("sheet=").append(getSheetName());if (lastSheetName!= null) {sb.append(" : ");sb.append("sheet=").append(lastSheetName);}sb.append("! ");sb.append(formatReferenceAsString());sb.append("]");return sb.toString();}
public PushCommand setRefSpecs(List<RefSpec> specs) {checkCallable();this.refSpecs.clear();this.refSpecs.addAll(specs);return this;}
public String toString() {return field.toString();}
public final X[]() {return X.clone();}
public int read() {if (pos < size) {return s.charAt(pos++);} else {s = null;return -1;}}
public PersonIdent getRefLogIdent() {return refLogIdent;}
public int size() {return size;}
public GetRequestValidatorsResult getRequestValidators(GetRequestValidatorsRequest request) {request = beforeClientExecution(request);return executeGetRequestValidators(request);}
public String toString() {return "I(n)";}
public boolean equals(Object o) {return o instanceof Token;}
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) { readHeader( data, offset );int pos            = offset + 8;int size           = 0;field_1_numShapes   =  LittleEndian.getInt( data, pos + size );     size += 4;field_2_lastMSOSPID =  LittleEndian.getInt( data, pos + size );     size += 4;return getRecordSize();}
public String getSignerName() {return null;}
@Override public void clear() {if (size!= 0) {Arrays.fill(table, null);entryForNullKey = null;modCount++;size = 0;}}
public CancelCapacityReservationResult cancelCapacityReservation(CancelCapacityReservationRequest request) {request = beforeClientExecution(request);return executeCancelCapacityReservation(request);}
public ImportDocumentationPartsResult importDocumentationParts(ImportDocumentationPartsRequest request) {request = beforeClientExecution(request);return executeImportDocumentationParts(request);}
public SelectResult select(SelectRequest request) {request = beforeClientExecution(request);return executeSelect(request);}
public Explanation explain(String docIdField, int numPayloadsSeen, long payloadScore) {return Explanation.match(getExplanation(docIdField, numPayloadsSeen, payloadScore, "p")));}
public int serialize(int offset, byte[] data, EscherSerializationListener listener) {listener.beforeRecordSerialize( offset, getRecordId(), this );if (remainingData == null) {remainingData = EMPTY;}LittleEndian.putShort( data, offset, getOptions() );LittleEndian.putShort( data, offset + 2, getRecordId() );LittleEndian.putInt( data, offset + 4, remainingData.length );System.arraycopy( remainingData, 0, data, offset + 8, remainingData.length );int pos = offset + 8 + remainingData.length;listener.afterRecordSerialize( pos, getRecordId(), pos - offset, this );return pos - offset;}
public synchronized String toString() {return super.toString();}
public static long[] copyOfRange(long[] original, int start, int end) {if (start > end) {throw new IllegalArgumentException();}int originalLength = original.length;if (start < 0 || start > originalLength) {throw new ArrayIndexOutOfBoundsException();}int resultLength = end - start;int copyLength = Math.min(resultLength, originalLength - start);long[] result = new long[resultLength];System.arraycopy(original, start, result, 0, copyLength);return result;}
public static byte[] toObject(ByteBuffer buf) {byte[] result = new byte[buf.remaining()];buffer.get(result, 0, result.length);return result;}
public void setProgress(int value) {setProgress(value > 0.0f? 1.0f : 0.0);}
public void removeCell(int rowIndex, int columnIndex) {if (rowIndex > _lastRowIndex) {throw new IllegalArgumentException("Invalid rowIndex " + rowIndex + " to remove cell index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastRowIndex + " index " + _lastColumnIndex);}if (rowIndex > _lastRowIndex) {_lastRowIndex = _lastRowIndex;_lastRowIndex = _lastColumnIndex;_lastColumnIndex = _lastColumnIndex;_lastColumnIndex = _firstColumnIndex;_firstColumnIndex = -1;_lastColumnIndex = -1;}
public static String canonicalize(String path) {int colon = path.lastIndexOf('/');if (colon < 0) {return path.toString();}int e = path.lastIndexOf('/');if (colon < 0) {return path.toString();}String canonicalName = path.substring(0, e.length() - 1);if (canonicalName == null) {canonicalName = path.substring(e.length() - 1);}return canonicalName + path.substring(0, e.length());}
public ApostropheFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public Entry<K, V> next() {return nextEntry();}
public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {request = beforeClientExecution(request);return executeDeleteEnvironment(request);}
public int stem(char s[], int len) {if (len < 4) return len;final int origLen = len;len = rule0(s, len);len = rule1(s, len);len = rule2(s, len);len = rule3(s, len);len = rule4(s, len);len = rule5(s, len);len = rule6(s, len);len = rule7(s, len);len = rule8(s, len);len = rule9(s, len);len = rule10(s, len);len = rule11(s, len);len = rule12(s, len);len = rule13(s, len);len = rule14(s, len);len = rule15(s, len);len = rule16(s, len);len = rule17(s, len);len = rule18(s, len
public void add(ChildRecord o) {field_1_child_record = o.field_1_child_record;}
public ListAlbumsRequest() {super("CloudPhoto", "2017-07-11", "ListAlbums", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public AddDomainIntlRegistrantInfoRequest(String registrantId, IdentityCredential identityCredential) {setRegistrantId(regantId);setIdentityCredential(identityCredential);}
public int getPixelHeight(int srcRowIndex, int srcColumnIndex) {return srcRowIndex * 0.5 + getPixelHeight(srcColumnIndex);}
public DescribeReservedInstancesResult describeReservedInstances() {return describeReservedInstances(new DescribeReservedInstancesRequest());}
public void setPackedGitMMAP(boolean value) {this.packedGitMMAP = value;}
public POIFSDocument(String path) {this.path = path;}
public final String toString() {return key + "=" + value;}
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final int byte0 = blocks[blocksOffset++] & 0xFF;final int byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte0 << 6) | (byte1 >>> 2);final int byte2 = blocks[blocksOffset++] & 0xFF;final int byte3 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 3) << 12) | (byte2 << 4) | (byte3 >>> 4);final int byte4 = blocks[blocksOffset++] & 0xFF;final int byte5 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte3 & 15) << 10) | (byte
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_number_of_sheets);if(isExternalReferences()) {StringUtil.writeUnicodeString(out, field_2_encoded_url);for (String field_3_sheet_name : field_3_sheet_names) {StringUtil.writeUnicodeString(out, field_3_sheet_name);}} else {int field2val = _isAddInFunctions? TAG_ADD_IN_FUNCTIONS : TAG_INTERNAL_REFERENCES;out.writeShort(field2val);}}
public PatternConsumer(Pattern pattern) {this.pattern = pattern;}
public Object getField(String name) {return fields.get(name);}
public ListIdentityPoolUsageResult listIdentityPoolUsage(ListIdentityPoolUsageRequest request) {request = beforeClientExecution(request);return executeListIdentityPoolUsage(request);}
public ValueEval evaluate(ValueEval[] args, int srcCellRow, int srcCellCol) {int arg0 = BaseRef.calculateRef(args, srcCellRow, srcCellCol);if (arg0 == null || arg0.length == 0) {return ErrorEval.VALUE_INVALID;}int baseRef = BaseRef.calculateBaseRef(args, srcCellRow, srcCellCol);if (baseRef == 0) {return ErrorEval.VALUE_INVALID;}return new StringEval(BaseRef.get(baseRefRef));}
public Map<Integer, Long> getCountsByTime() {return countsByTime;}
public UpdateAccountResult updateAccount(UpdateAccountRequest request) {request = beforeClientExecution(request);return executeUpdateAccount(request);}
public DescribeTrainingJobResult describeTrainingJob(DescribeTrainingJobRequest request) {request = beforeClientExecution(request);return executeDescribeTrainingJob(request);}
public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {request = beforeClientExecution(request);return executeDeleteGroup(request);}
public void advance(long target) {final int minDoc = Math.min(target.length(), MAX_RECORD_ID);int maxDoc = Math.max(target.length(), MAX_RECORD_ID);if (minDoc < 0) {maxDoc = 0;}if (docId < target) {return;}final int maxDoc = Math.max(target.length(), MAX_RECORD_ID);if (docId > maxDoc) {return;}for (int i = 0; i < maxDoc; i++) {docId = Math.min(docId, maxDocId);}}
public RegisterListenerResult registerListener(RegisterReaderListenerRequest request) {request = beforeClientExecution(request);return executeRegisterListener(request);}
public static double[] grow(double[] array, int minSize) {assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";if (array.length < minSize) {return growExact(array, oversize(minSize, Double.BYTES));} else return array;}
public void visitTerminal(Parser recognizer, TerminalNode terminalNode) {accept(recognizer, terminalNode, null);}
public TokenStream create(TokenStream input) {return new LatvianStemFilter(input);}
public ReplicationGroup increaseReplicaCount(IncreaseReplicaCountRequest request) {request = beforeClientExecution(request);return executeIncreaseReplicaCount(request);}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long byte0 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = byte0 >>> 5;values[valuesOffset++] = (byte0 >>> 2) & 7;final long byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte0 & 3) << 1) | (byte1 >>> 7);values[valuesOffset++] = (byte1 >>> 4) & 7;values[valuesOffset++] = (byte1 >>> 1) & 7;final long byte2 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 1) << 2) | (byte2 >>> 6);values[valuesOffset++] = (
public StopHyperParameterJobResult stopHyperParameterJob(StopHyperParameterJobRequest request) {request = beforeClientExecution(request);return executeStopHyperParameterJob(request);}
public ResetNetworkInterfaceAttributesResult resetNetworkInterfaceAttributes(ResetNetworkInterfaceAttributesRequest request) {request = beforeClientExecution(request);return executeResetNetworkInterfaceAttributes(request);}
public Blob lookupBlobById(BlobId id) {return lookupBlob(id.getId());}
public ListGroupMembershipsResult listGroupMemberships(ListGroupMembershipsRequest request) {request = beforeClientExecution(request);return executeListGroupMemberships(request);}
public static void mkdirs(File d, boolean skipExisting)throws IOException {if (!d.mkdirs()) {if (skipExisting && d.isDirectory())return;throw new IOException(MessageFormat.format(JGitText.get().mkDirsFailed, d.getAbsolutePath()));}}
public UpdateDetectorVersionMetadataResult updateDetectorVersionMetadata(UpdateDetectorVersionMetadataRequest request) {request = beforeClientExecution(request);return executeUpdateDetectorVersionMetadata(request);}
public void write(String str, int offset, int count) throws IOException {synchronized (lock) {if (count < 0) {throw new StringIndexOutOfBoundsException(str, offset, count);}if (str == null) {throw new NullPointerException("str == null");}if ((offset | count) < 0 || offset > str.length() - count) {throw new StringIndexOutOfBoundsException(str, offset, count);}checkStatus();CharBuffer chars = CharBuffer.wrap(str, offset, count + offset);convert(chars);}}
public void ensureCapacity(int min) {if (min > value.length) {int ourMin = value.length*2 + 2;enlargeBuffer(Math.max(ourMin, min));}}
public GetRecipeResult recipe(GetRecipeRequest request) {request = beforeClientExecution(request);return executeGetRecipe(request);}
public DisassociateRouteTableResult disassociateRouteTable(DisassociateRouteTableRequest request) {request = beforeClientExecution(request);return executeDisassociateRouteTable(request);}
public SetTopicAttributesRequest(java.util.List<SetTopicAttribute> attributes) {setAttributes(attributes);}
public static char[] grow(char[] array, int minSize) {assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";if (array.length < minSize) {return growExact(array, oversize(minSize, Character.BYTES));} else return array;}
public Reminder(Repository repo) {this.repo = repo;}
public FormulaRecord(RecordInputStream in) {field_1_formula_offset = in.readInt();field_2_formula_length = in.readInt();}
public SynonymQuery build() {Collections.sort(terms, Comparator.comparing(a -> a.term));return new SynonymQuery(terms.toArray(new TermAndBoost[0]), field);}
public PasswordRev4Record(RecordInputStream in) {field_1_password = in.readShort();}
public boolean isReadOnly() {return true;}
public int indexOf(int y) {return indexOf(x, y);}
public CodepageRecord(RecordInputStream in) {field_1_codepage = in.readShort();}
public ApproveAssignmentResult approveAssignment(ApproveAssignmentRequest request) {request = beforeClientExecution(request);return executeApproveAssignment(request);}
public DescribeVpnConnectionsResult describeVpnConnections() {return describeVpnConnections(new DescribeVpnConnectionsRequest());}
public V next() { return nextEntry().value; }
public GetInstanceHealthResult getInstanceHealth(GetInstanceHealthRequest request) {request = beforeClientExecution(request);return executeGetInstanceHealth(request);}
public RegisterTransportProtocolResult registerTransportProtocol(RegisterTransportProtocolRequest request) {request = beforeClientExecution(request);return executeRegisterTransportProtocol(request);}
public static char[] copyOfRange(char[] original, int start, int end) {if (start > end) {throw new IllegalArgumentException();}int originalLength = original.length;if (start < 0 || start > originalLength) {throw new ArrayIndexOutOfBoundsException();}int resultLength = end - start;int copyLength = Math.min(resultLength, originalLength - start);char[] result = new char[resultLength];System.arraycopy(original, start, result, 0, copyLength);return result;}
public static void fill(int[] array, int start, int end, int value) {Arrays.checkStartAndEnd(array.length, start, end);for (int i = start; i < end; i++) {array[i] = value;}}
public Class<? extends Record> next() {return next();}
public static char[] copyOf(char[] original, int newLength) {if (newLength < 0) {throw new NegativeArraySizeException();}return copyOfRange(original, 0, newLength);}
public DeleteRelationalDatabaseResult deleteRelationalDatabase(DeleteRelationalDatabaseRequest request) {request = beforeClientExecution(request);return executeDeleteRelationalDatabase(request);}
public boolean equals( Object o ) {return o instanceof WeightedPhraseInfo;}
public boolean hasNext() {return blocks.length > 0;}
public void write(int oneChar) {synchronized (lock) {expand(1);buf[count++] = (char) oneChar;}}
public void serialize(LittleEndianOutput out) {out.writeShort(sid);out.writeShort(_reserved0);out.writeShort(_reserved1);out.writeShort(_reserved2);}
public ListHierarchyGroupsResult listHierarchyGroups(ListHierarchyGroupsRequest request) {request = beforeClientExecution(request);return executeListHierarchyGroups(request);}
public TopicArn(String topicArn) {setTopicArn(topicArn);}
public CreateTrafficPolicyVersionResult createTrafficPolicyVersion(CreateTrafficPolicyVersionRequest request) {request = beforeClientExecution(request);return executeCreateTrafficPolicyVersion(request);}
@Override public synchronized boolean equals(Object object) {return (object instanceof Map) &&entrySet().equals(((Map<?,?>)object).entrySet());}
public ListResourcesResult listResources(ListResourcesRequest request) {request = beforeClientExecution(request);return executeListResources(request);}
public AtomicReferenceArray(char[] array, int value) {Arrays.checkOffsetAndCount(array.length, offset, value.length);this.value = array;return this;}
public FeatHdrRecord() {field_4_name_index = 0;field_5_version = 0;field_6_version = 0;}
public DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(DisassociatePhoneNumbersFromVoiceConnectorRequest request) {request = beforeClientExecution(request);return executeDisassociatePhoneNumbersFromVoiceConnector(request);}
public ObjectId idFor(int type, byte[] data) {return delegate().idFor(type, data);}
public void removeParseListener(ParseTreeListener listener) {if (listener!= null) listener.onRemoveParseListener(this);}
public AxisData(RecordInputStream in) {field_1_axis_num = in.readInt();field_2_x_axis_num = in.readInt();field_3_y_axis_num = in.readInt();field_4_width = in.readInt();field_5_height = in.readInt();}
public static double max(double[] values) {double maxValue = Double.NaN;if (values==null) {maxValue = 0;} else {maxValue = Math.max(maxValue, values.length);}return maxValue;}
public boolean addFacetValue(FacetValue newValue) {int index = facetIndex? facetIndex + 1 : 0;if (index >= facets.size()) {throw new IndexOutOfBoundsException(String.valueOf(index));}boolean added = false;if (value == null) {added = true;}facets.add(index, newValue);return added;}
public String toString() {return "fileName=" + fileName + " size=" + size;}
public String toString(){StringBuilder buffer = new StringBuilder();buffer.append("[IFMT]\n");buffer.append("   .formatIndex          = ").append("0x").append(HexDump.toHex(  getFormatIndex ())).append(" (").append( getFormatIndex() ).append(" )");buffer.append(System.getProperty("line.separator"));buffer.append("[/IFMT]\n");return buffer.toString();}
public CharVector(int capacity) {if (capacity < 0) {throw new IllegalArgumentException("Capacity: " + capacity);}if (capacity == 0) {throw new IllegalArgumentException("Capacity: " + capacity);}capacity = capacity;}
public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {request = beforeClientExecution(request);return executeDescribeAccountLimits(request);}
public void removeBuiltinRecord(byte record) {throw new UnsupportedOperationException();}
public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest request) {request = beforeClientExecution(request);return executeCreateSecurityGroup(request);}
public boolean equals(Object o) {return this.getClass() == o.getClass();}
public GetObjectResult getObject(GetObjectRequest request) {request = beforeClientExecution(request);return executeGetObject(request);}
public StringBuilder append(long l) {IntegralToString.appendLong(this, l);return this;}
public GetIntegrationResponsesResult getIntegrationResponses(GetIntegrationResponsesRequest request) {request = beforeClientExecution(request);return executeGetIntegrationResponses(request);}
public ListDeploymentConfigsResult listDeploymentConfigs(ListDeploymentConfigsRequest request) {request = beforeClientExecution(request);return executeListDeploymentConfigs(request);}
public void removeCellRange(int index) {removeCellRange(index);}
public DimensionConfig dimConfig(String dimensionName) {String dimConfigName = dimensionName.toUpperCase(Locale.ROOT);return new DimensionConfig(dimConfigName);}
public GetStackDrift(GetStackDriftRequest request) {request = beforeClientExecution(request);return executeGetStackDrift(request);}
public CreateCommandLineParametersResult createCommandLineParameters(CreateCommandLineParametersRequest request) {request = beforeClientExecution(request);return executeCreateCommandLineParameters(request);}
public RepositoryAssociationResult getRepositoryAssociation(RepositoryAssociationRequest request) {request = beforeClientExecution(request);return executeRepositoryAssociation(request);}
public Enumeration<T> elements() {return new Iterator<T>();}
public void set(int index, int n) {if (count < index)throw new ArrayIndexOutOfBoundsException(index);else if (count == index)add(n);elseentries[index] = n;}
public HTMLStripCharFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public long getEntryPathLength() {return pathLength;}
public void serialize(LittleEndianOutput out) {out.writeShort(field_1_field_flags);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[1904]\n");buffer.append("   .is1904          = ").append(Integer.toHexString(getWindowing())).append("\n");buffer.append("[/1904]\n");return buffer.toString();}
public ContinueDeploymentResult continueDeployment(ContinueDeploymentRequest request) {request = beforeClientExecution(request);return executeContinueDeployment(request);}
public void set(int index, int n) {if (count < index)throw new ArrayIndexOutOfBoundsException(index);else if (count == index)add(n);elseentries[index] = n;}
public final long next() {assert hasNext();long result = currentValues[pOff++];if (pOff == currentCount) {vOff += 1;pOff = 0;fillBlock();}return result;}
public static final RevFilter between(Date since, Date until) {return between(since.getTime(), until.getTime());}
public DeleteVaultResult deleteVault(DeleteVaultRequest request) {request = beforeClientExecution(request);return executeDeleteVault(request);}
public void reset() throws IOException {drain();output.writeByte(TC_RESET);resetState();}
public DetachSymbolicReferenceResult detachSymbolicReference(DetachSymbolicReferenceRequest request) {request = beforeClientExecution(request);return executeDetachSymbolicReference(request);}
public ModifyIdentityFormatResult modifyIdentityFormat(ModifyIdentityFormatRequest request) {request = beforeClientExecution(request);return executeModifyIdentityFormat(request);}
public void addException(Exception exception) {exceptions.add(exception);}
public GreekStemFilterFactory(Map<String,String> args) {super(args);if (!args.isEmpty()) {throw new IllegalArgumentException("Unknown parameters: " + args);}}
public RegisterTypeResult registerType(RegisterTypeRequest request) {request = beforeClientExecution(request);return executeRegisterType(request);}
public GetAccessControlEffectResult getAccessControlEffect(GetAccessControlEffectRequest request) {request = beforeClientExecution(request);return executeGetAccessControlEffect(request);}
public HSSFShapeGroup createGroup(HSSFClientAnchor anchor) {HSSFShapeGroup group = new HSSFShapeGroup(null, anchor);addShape(group);onCreate(group);return group;}
public String toString() {return super.toString() + ":" + revstr;}
public static FontCharset valueOf(int value){return (value < 0 || value >= _table.length)? null :_table[value];}
public NLPSentenceDetector(String splitter) {this.splitter = splitter;}
public GetResourceResult getResource(GetResourceRequest request) {request = beforeClientExecution(request);return executeGetResource(request);}
public QueryScorer(Query query, String field) {init(query, field, true);}
public GetActiveTrustedSignerListResult setActiveTrustedSignerList(GetActiveTrustedSignerListRequest request) {request = beforeClientExecution(request);return executeGetActiveTrustedSignerList(request);}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public UpdateNodegroupConfigurationResult updateNodegroupConfiguration(UpdateNodegroupConfigurationRequest request) {request = beforeClientExecution(request);return executeUpdateNodegroupConfiguration(request);}
public static void fill(float[] array, float value) {for (int i = 0; i < array.length; i++) {array[i] = value;}}
public ListTrainingJobsResult listTrainingJobs(ListTrainingJobsRequest request) {request = beforeClientExecution(request);return executeListTrainingJobs(request);}
public GetProfilingGroupResult getProProfilingGroup(GetProfilingGroupRequest request) {request = beforeClientExecution(request);return executeGetProfilingGroup(request);}
public IgnoreRulesRequest(java.util.List<String> rules) {setRules(rules);}
public static void fill(char[] array, int start, int end, char value) {for (int i = start; i < end; i++) {array[i] = value;}}
public GetTransitGatewayMulticastDomainAssociationsResult getTransitGatewayMulticastDomainAssociations(GetTransitGatewayMulticastDomainAssociationsRequest request) {request = beforeClientExecution(request);return executeGetTransitGatewayMulticastDomainAssociations(request);}
public FloatBuffer compact() {System.arraycopy(backingArray, position + offset, backingArray, offset, remaining());position = limit - position;limit = capacity;mark = UNSET_MARK;return this;}
public DescribeAppElebrityResult describeAppElebrity(DescribeAppElebrityRequest request) {request = beforeClientExecution(request);return executeDescribeAppElebrity(request);}
public GetTranscriptResult getTranscript(GetTranscriptRequest request) {request = beforeClientExecution(request);return executeGetTranscript(request);}
public DeleteCacheParameterGroupResult deleteCacheParameterGroup(DeleteCacheParameterGroupRequest request) {request = beforeClientExecution(request);return executeDeleteCacheParameterGroup(request);}
public GetFiltersRequest(Map<String, String> filters) {setFilters(filters);}
public CreateCustomMetadataResult createCustomMetadata(CreateCustomMetadataRequest request) {request = beforeClientExecution(request);return executeCreateCustomMetadata(request);}
public Cluster resumeCluster(ResumeClusterRequest request) {request = beforeClientExecution(request);return executeResumeCluster(request);}
public DescribeMovedAddressesResult describeMovedAddresses(DescribeMovedAddressesRequest request) {request = beforeClientExecution(request);return executeDescribeMovedAddresses(request);}
public SearchARNsResult searchARNs(SearchARNsRequest request) {request = beforeClientExecution(request);return executeSearchARNs(request);}
public ApplyDomainGroupRequest() {super("DomainGroup", "2019-12-11", "ApplyDomainGroup", "domaingroup");setMethod(MethodType.POST);}
public void add(RevCommit c) {Block b = head;if (b == null ||!b.canUnpop()) {b = free.newBlock();b.resetToEnd();b.next = head;head = b;}b.unpop(c);}
public ByteBuffer putFloat(int index, float value) {throw new ReadOnlyBufferException();}
public void flush() throws IOException {drain();output.flush();}
public SetModifiedFieldsResult getModifiedFields() {return modifiedFields;}
public long next() throws IOException {try {return block[nextIndex++];} catch (IOException e) {throw new RuntimeException(e);}}
public ShortBuffer slice() {byteBuffer.limit(limit * SizeOf.SHORT);byteBuffer.position(position * SizeOf.SHORT);ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());ShortBuffer result = new ShortToByteBufferAdapter(bb);byteBuffer.clear();return result;}
public boolean isEmpty() {return sequence.isEmpty();}
public byte[] commit(byte[] array, int offset, int length) {checkPosition(array.length, offset);if (byteOffset < 0 || offset > array.length) {throw new IndexOutOfBoundsException();}Arrays.checkOffsetAndCount(array.length, offset, length);if (byteOffset > array.length) {throw new IndexOutOfBoundsException();}System.arraycopy(array, 0, array, offset, array.length);return array;}
public ValueEval evaluate(ValueEval[] args, int srcCellRow, int srcCellCol) {Date now = new Date(System.currentTimeMillis());return new NumberEval(DateUtil.getExcelDate(now));}
public DeleteSuggesterResult deleteSuggester(DeleteSuggesterRequest request) {request = beforeClientExecution(request);return executeDeleteSuggester(request);}
public CreatePipelineResult createPipeline(CreatePipelineRequest request) {request = beforeClientExecution(request);return executeCreatePipeline(request);}
public StopDeliveryStreamEncryptionResult stopDeliveryStreamEncryption(StopDeliveryStreamEncryptionRequest request) {request = beforeClientExecution(request);return executeStopDeliveryStreamEncryption(request);}
public DeleteApplicationSnapshotResult deleteApplicationSnapshot(DeleteApplicationSnapshotRequest request) {request = beforeClientExecution(request);return executeDeleteApplicationSnapshot(request);}
public ApplyCommand apply() {return new ApplyCommand(repo);}
public CacheCluster rebootCacheCluster(RebootCacheClusterRequest request) {request = beforeClientExecution(request);return executeRebootCacheCluster(request);}
public CacheCluster modifyCacheCluster(ModifyCacheClusterRequest request) {request = beforeClientExecution(request);return executeModifyCacheCluster(request);}
public boolean equals(Object o) {return this.getClass() == o.getClass();}
public AssociateTransitGatewayMulticastDomainResult associateTransitGatewayMulticastDomain(AssociateTransitGatewayMulticastDomainRequest request) {request = beforeClientExecution(request);return executeAssociateTransitGatewayMulticastDomain(request);}
public UpdateContactResult updateContact(UpdateContactRequest request) {request = beforeClientExecution(request);return executeUpdateContact(request);}
public RefPtg() {field_6_res = 0;}
public CreateProcessingJobResult createProcessingJob(CreateProcessingJobRequest request) {request = beforeClientExecution(request);return executeCreateProcessingJob(request);}
public final CharSequence subSequence(int start, int end) {checkStartEndRemaining(start, end);CharBuffer result = duplicate();result.limit(position + end);result.position(position + start);return result;}
public GetUsageCoipPoolResult getUsageCoipPool(GetUsageCoipPoolRequest request) {request = beforeClientExecution(request);return executeGetUsageCoipPool(request);}
public UpdateResolverEndpointResult updateResolverEndpoint(UpdateResolverEndpointRequest request) {request = beforeClientExecution(request);return executeUpdateResolverEndpoint(request);}
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {ValueEval ve;try {ve = OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);} catch (EvaluationException e) {ve = e.getErrorEval();}return BoolEval.valueOf(evaluate(ve));}
public NameRecord addExternalName(String name) {setName(name);}
public FormatRecord getFormat(int formatId) {GetFormatRecord r = _formats.get(formatId);if (r == null) {return r;}return r;}
public ListPartnerEventSourcesResult listPartnerEventSources(ListPartnerEventSourcesRequest request) {request = beforeClientExecution(request);return executeListPartnerEventSources(request);}
public File getFile() {return file;}
public void onChanged() {List<String> elements = new ArrayList<>();for (int i = 0; i < count; i++) {elements.add(i.toString());}}
public final String toString() {return text;}
public LongBuffer put(long[] src, int srcOffset, int longCount) {if (longCount > remaining()) {throw new BufferOverflowException();}System.arraycopy(src, srcOffset, backingArray, offset + position, longCount);position += longCount;return this;}
public boolean remove(Object object) {Iterator<E> it = iterator();if (object!= null) {while (it.hasNext()) {if (object.equals(it.next())) {it.remove();return true;}}} else {while (it.hasNext()) {if (it.next() == null) {it.remove();return true;}}}return false;}
public long length() {return length;}
public FieldBoostMap(QueryConfigHandler queryConfigHandler) {this.queryConfig = queryConfigHandler;}
public StartActivityStreamResult startActivityStream(StartActivityStreamRequest request) {request = beforeClientExecution(request);return executeStartActivityStream(request);}
public HyphenateWordResult hyphenateWord(HyphenateWordRequest request) {request = beforeClientExecution(request);return executeHyphenateWord(request);}
public CreateSmsTemplateResult createSmsTemplate(CreateSmsTemplateRequest request) {request = beforeClientExecution(request);return executeCreateSmsTemplate(request);}
@Override public synchronized void clear() {if (size() == 0)throw new IllegalStateException();count = 0;}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public long get(int index) {final int o = index >>> 1;final int b = index & 1;final int shift = b << 5;return (blocks[o] >>> shift) & 4294967295L;}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {switch (args.length) {case 3:return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);case 4:return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2], args[3]);}return ErrorEval.VALUE_INVALID;}
public Entry<K, V> lastEntry() {return immutableCopy(lastEntry);}
public DeleteEvaluationResult deleteEvaluation(DeleteEvaluationRequest request) {request = beforeClientExecution(request);return executeDeleteEvaluation(request);}
public ContinueRecord(RecordInputStream in) {_reserved = in.readInt();}
public static RevFilter create(RevFilter a, RevFilter b) {if (a == ALL)return b;if (b == ALL)return a;return b;}
public final CharSequence subSequence(int start, int end) {checkStartEndRemaining(start, end);CharBuffer result = duplicate();result.limit(position + end);result.position(position + start);return result;}
public CreateTrafficMirrorSessionResult createTrafficMirrorSession(CreateTrafficMirrorSessionRequest request) {request = beforeClientExecution(request);return executeCreateTrafficMirrorSession(request);}
public CreateNodeGroupResult createNodeGroup(CreateNodeGroupRequest request) {request = beforeClientExecution(request);return executeCreateNodeGroup(request);}
public SoraniStemFilter create(TokenStream input) {return new SoraniStemFilter(input);}
public UpdateCustomVerificationEmailTemplateResult updateCustomVerificationEmailTemplate(UpdateCustomVerificationEmailTemplateRequest request) {request = beforeClientExecution(request);return executeUpdateCustomVerificationEmailTemplate(request);}
public static FormulaError forInt(byte type) throws IllegalArgumentException {FormulaError err = bmap.get(type);if(err == null) throw new IllegalArgumentException("Unknown error type: " + type);return err;}
public DeleteSubnetGroupResult deleteSubnetGroup(DeleteSubnetGroupRequest request) {request = beforeClientExecution(request);return executeDeleteSubnetGroup(request);}
public String toFormulaString() {return FormulaError.forInt(field_1_error_code).getString();}
public Object toObject() {return value;}
public void deleteOnDisk() {throw new UnsupportedOperationException();}
public void decreaseReplicationFactor(DecreaseReplicationFactorRequest request) {request = beforeClientExecution(request);executeDecreaseReplicationFactor(request);}
public Count(){_predicate = defaultPredicate;}
public Workbook getWorkbook() {return null;}
public DescribeRouteTablesResult describeRouteTables() {return describeRouteTables(new DescribeRouteTablesRequest());}
public CreateAssessmentTemplateResult createAssessmentTemplate(CreateAssessmentTemplateRequest request) {request = beforeClientExecution(request);return executeCreateAssessmentTemplate(request);}
public DeleteProjectResult deleteProject(DeleteProjectRequest request) {request = beforeClientExecution(request);return executeDeleteProject(request);}
public DeleteAttributesRequest(String userName, String policyName) {setUserName(userName);setPolicyName(policyName);}
public TermVectorsReader clone() {if (in == null) {throw new AlreadyClosedException("this TermVectorsReader is closed");}return new SimpleTextTermVectorsReader(offsets, in.clone());}
public void close() {super.close();}
public ByteBuffer putLong(long value) {throw new ReadOnlyBufferException();}
public Serializer serialize(int workbookOffset, long offset) {this.workbookOffset = workbookOffset;this.offset = offset;serialize() ;return this;}
public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups() {return describeClusterSecurityGroups(new DescribeClusterSecurityGroupsRequest());}
public Explanation getHighestExplanation(int frequency, double norm) {return Explanation.match(pattern, score, frequency, norm);}
public DisassociatePhoneNumberFromUserResult disassociatePhoneNumberFromUser(DisassociatePhoneNumberFromUserRequest request) {request = beforeClientExecution(request);return executeDisassociatePhoneNumberFromUser(request);}
public boolean hasObject(AnyObjectId objectId, int typeHint) {return typeHint == AnyObjectId.TYPE_ANY;}
public String toString() {return this.attachedLabel;}
public String toString(String field) {StringBuilder buffer = new StringBuilder();buffer.append("[SPANQUERY]\n");buffer.append(" .isnew= ").append(field).append("\n");buffer.append(" .isold= ").append(isold);buffer.append(" .isnew= ").append(field).append("\n");buffer.append(" .isnew= ").append(isnew);buffer.append(" .isold= ").append(field).append("\n");buffer.append(" .isnew= ").append(isnew);buffer.append(" .isnew= ").append(field).append("\n");buffer.append(" .isnew= ").append(isnew);buffer.append(" .isnew= ").append(field.append("\n");
public DisableInsightRuleResult disableInsightRule(DisableInsightRuleRequest request) {request = beforeClientExecution(request);return executeDisableInsightRule(request);}
public RunIfBootstrapActionConfig(RunIfBootstrapActionConfig bootstrapActionConfig) {setBootstrapActionConfig(bootstrapActionConfig);}
public CharBuffer get(char[] dst, int dstOffset, int charCount) {Arrays.checkOffsetAndCount(dst.length, dstOffset, charCount);if (charCount > remaining()) {throw new BufferUnderflowException();}for (int i = dstOffset; i < dstOffset + charCount; ++i) {dst[i] = get();}return this;}
public String[] getSectionNames(String section, String subsection) {String[] params = getSections(section);String[] result = new String[params.length];for (int i = 0; i < params.length; i++) {if (i > 0) {result[i] = params[i];}return result;}return null;}
public CreateBrokerResult createBroker(CreateBrokerRequest request) {request = beforeClientExecution(request);return executeCreateBroker(request);}
public void absorbed() {mIndeterminate =!mIndeterminate || mIndeterminate == 0;if (mIndeterminate && mIndeterminate!= 0) {mStartTime = new Date();mIndeterminate = 0;}if (mIndeterminate!= 0) {mStartTime = new Date();mIndeterminate = mIndeterminate;}if (mIndeterminate!= 0) {mStartTime = new Date();mIndeterminate = false;}if (mIndeterminate!= 1) {mStartTime = new Date();}if (mIndeterminate!= 0) {mStartTime = new Date();mStartTime = new Date();mStartTime = new Date();mStartTime = new Date();mStartTime
public ListSuppressedDestinationsResult listSuppressedDestinations(ListSuppressedDestinationsRequest request) {request = beforeClientExecution(request);return executeListSuppressedDestinations(request);}
public List<? extends Map.Entry<K, V>> entrySet() {return entrySet;}
public ParameterNameValue(String name, String value) {setNameValue(name,value);}
public void put(int key, E value) {int i = binarySearch(mKeys, 0, mSize, key);if (i >= 0) {mValues[i] = value;} else {i = ~i;if (i < mSize && mValues[i] == DELETED) {mKeys[i] = key;mValues[i] = value;return;}if (mGarbage && mSize >= mKeys.length) {gc();i = ~binarySearch(mKeys, 0, mSize, key);}if (mSize >= mKeys.length) {int n = ArrayUtils.idealIntArraySize(mSize + 1);int[] nkeys = new int[n];Object[] nvalues = new Object[n];System.arraycopy(mKeys, 0, nkeys, 0, mKeys.length);System.arraycopy(mValues, 0, nvalues
public DeregisterImageResult deregisterImage(DeregisterImageRequest request) {request = beforeClientExecution(request);return executeDeregisterImage(request);}
public DescribeApplicationResult describeApplication(DescribeApplicationRequest request) {request = beforeClientExecution(request);return executeDescribeApplication(request);}
public ListProblemObservationsResult listProblemObservations(ListProblemObservationsRequest request) {request = beforeClientExecution(request);return executeListProblemObservations(request);}
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {int bytesRemaining = readHeader( data, offset );int pos            = offset + 8;remainingData = (bytesRemaining == 0)? EMPTY : IOUtils.safelyAllocate(bytesRemaining, MAX_RECORD_LENGTH);System.arraycopy( data, pos, remainingData, 0, bytesRemaining );return 8 + bytesRemaining;}
public boolean matches(byte[] ref, int suffixIndex) {return suffixIndex >= ref.length && ref[ref.length - suffixIndex] == suffixIndex;}
public DeleteOptionGroupResult deleteOptionGroup(DeleteOptionGroupRequest request) {request = beforeClientExecution(request);return executeDeleteOptionGroup(request);}
public static String utf16LE(byte[] buffer, int offset, int length) {return utf16LE(buffer, offset, length);}
public CellRangeAddressList(java.util.List<String> list) {setList(list);}
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {int nIncomingArgs = args.length;if(nIncomingArgs < 1) {throw new RuntimeException("function name argument missing");}ValueEval nameArg = args[0];String functionName;if (nameArg instanceof FunctionNameEval) {functionName = ((FunctionNameEval) nameArg).getFunctionName();} else {throw new RuntimeException("First argument should be a NameEval, but got ("+ nameArg.getClass().getName() + ")");}FreeRefFunction targetFunc = ec.findUserDefinedFunction(functionName);if (targetFunc == null) {throw new NotImplementedFunctionException(functionName);}int nOutGoingArgs = nIncomingArgs -1;ValueEval[] outGoingArgs = new ValueEval[nOutGoingArgs];System.arraycopy(args, 1, outGoingArgs, 0, nOutGoingArgs);return
public DescribeOptionGroupsResult describeOptionGroups() {return describeOptionGroups(new DescribeOptionGroupsRequest());}
public DisableVpcClassicLinkResult disableVpcClassicLink(DisableVpcClassicLinkRequest request) {request = beforeClientExecution(request);return executeDisableVpcClassicLink(request);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append( "[SXIDSTM]\n" );buffer.append( "   .numstrings     = " ).append(Integer.toHexString( getNumStrings() ) ).append( "\n" );buffer.append( "[/SXIDSTM]\n" );return buffer.toString();}
public DescribeStackInstancesResult describeStackInstances(DescribeStackInstancesRequest request) {request = beforeClientExecution(request);return executeDescribeStackInstances(request);}
public DescribeCompanyNetworkConfigurationResult describeCompanyNetworkConfiguration(DescribeCompanyNetworkConfigurationRequest request) {request = beforeClientExecution(request);return executeDescribeCompanyNetworkConfiguration(request);}
public final void flush() throws IOException {flush(new CharArrayWriter(buffer, offset, length));}
public DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest request) {request = beforeClientExecution(request);return executeDescribeDBClusters(request);}
public GetDocumentVersionResult getDocumentVersion(GetDocumentVersionRequest request) {request = beforeClientExecution(request);return executeGetDocumentVersion(request);}
public void subtract(T_Point t1, T_Point t2) {assert t1!= null;assert t2!= null;if (t1 == null ||!t2.isEmpty()) {assert!t1.isEmpty();}if (t2.isEmpty()) {return;}boolean result = false;if (arg1.compareTo(t1) == 0) {result = true;} else {result = isEqual(arg1.compareTo(t2));if (!result) {result &= ~(1L << t2));if (result) {result &= ~(1L << t2));}}}}
public ModifyCapacityResult modifyCapacity(ModifyCapacityRequest request) {request = beforeClientExecution(request);return executeModifyCapacity(request);}
public int size() {return count;}
public void decode(byte[] blocks, int blocksOffset, long[] values, int valuesOffset, int iterations) {for (int i = 0; i < iterations; ++i) {final long byte0 = blocks[blocksOffset++] & 0xFF;final long byte1 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = (byte0 << 6) | (byte1 >>> 2);final long byte2 = blocks[blocksOffset++] & 0xFF;final long byte3 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte1 & 3) << 12) | (byte2 << 4) | (byte3 >>> 4);final long byte4 = blocks[blocksOffset++] & 0xFF;final long byte5 = blocks[blocksOffset++] & 0xFF;values[valuesOffset++] = ((byte3 & 15) << 10) | (byte
public int length() {return length();}
public String toFormulaString() {StringBuilder sb = new StringBuilder(64);boolean needsExclamation = false;if (externalWorkbookNumber >= 0) {sb.append('[');sb.append(externalWorkbookNumber);sb.append(']');needsExclamation = true;}if (sheetName!= null) {SheetNameFormatter.appendFormat(sb, sheetName);needsExclamation = true;}if (needsExclamation) {sb.append('!');}sb.append(nameName);return sb.toString();}
public T next() {if (size <= index)throw new NoSuchElementException();T res = block[blkIdx];if (++blkIdx == BLOCK_SIZE) {if (++dirIdx < directory.length)block = directory[dirIdx];elseblock = null;blkIdx = 0;}index++;return res;}
public static String longToHex(long value) {StringBuilder sb = new StringBuilder(18);writeHex(sb, value, 16, "0x");return sb.toString();}
public long get(int index) {final int o = index / 21;final int b = index % 21;final int shift = b * 3;return (blocks[o] >>> shift) & 7L;}
public void clearRange() {length = 0;}
public TokenStream(TokenStream input) {this(input, TokenStream.EOF);}
public UpdateGameServerGroupResult updateGameServerGroup(UpdateGameServerGroupRequest request) {request = beforeClientExecution(request);return executeUpdateGameServerGroup(request);}
public StringFunction(String input) {this.input = input;}
public UpdateIdentityProviderConfigurationResult updateIdentityProviderConfiguration(UpdateIdentityProviderConfigurationRequest request) {request = beforeClientExecution(request);return executeUpdateIdentityProviderConfiguration(request);}
public int lastIndexOf(Object object) {Object[] snapshot = elements;return lastIndexOf(object, snapshot, 0, snapshot.length);}
public SrndQueryFactory(QueryFactory queryFactory) {this.queryFactory = queryFactory;}
public int getTokenCount(int channel) {return channel * Token.DEFAULT_TOKEN_SIZE;}
public Path(String[] components) {this.components = components;}
public SQLException createSQLException(String reason) {super(reason);}
public ListFragmentsResult listFragments(ListFragmentsRequest request) {request = beforeClientExecution(request);return executeListFragments(request);}
public static Builder getNodeBuilder(String nodeName) {return nodes.get(nodeName.toUpperCase(Locale.ROOT));}
public CreateDirectoryResult createDirectory(CreateDirectoryRequest request) {request = beforeClientExecution(request);return executeCreateDirectory(request);}
public int getExternalSheetIndex(String workbookName, String sheetName) {return _iBook.getExternalSheetIndex(workbookName, sheetName);}
public V getValue() {return value;}
public final K getKey() {return key;}
public boolean isTransparent() {return false;}
public void setKeepEmpty(boolean keepEmpty) {this.keepEmpty = keepEmpty;}
public XPathRuleElement(String ruleName, int ruleIndex) {super(ruleName);this.ruleIndex = ruleIndex;}
public int getHeight() {return mImage.getHeight();}
public void write(byte[] buffer, int offset, int length) throws IOException {throw new UnsupportedOperationException();}
public void jumpDrawablesToCurrentState() {super.jumpDrawablesToCurrentState();if (mProgressDrawable!= null) mProgressDrawable.jumpToCurrentState();if (mIndeterminateDrawable!= null) mIndeterminateDrawable.jumpToCurrentState();}
public Analyzer(String field, AnalyzerParameters parameters) {super(field);this.parameters = parameters;}
public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request) {request = beforeClientExecution(request);return executeDescribeVolumes(request);}
public GetLogsResult getLogs(GetLogsRequest request) {request = beforeClientExecution(request);return executeGetLogs(request);}
public UpdateApiMethodResult updateApiMethod(UpdateApiRequest request) {request = beforeClientExecution(request);return executeUpdateApiMethod(request);}
public GetAuthorizationTokenRequest() {super("cr", "2016-06-07", "GetAuthorizationToken", "cr");setUriPattern("/v2/authorizations");setMethod(MethodType.GET);}
public StopContactResult stopContact(StopContactRequest request) {request = beforeClientExecution(request);return executeStopContact(request);}
public CreateDataSetResult createDataSet(CreateDataSetRequest request) {request = beforeClientExecution(request);return executeCreateDataSet(request);}
public GetCachedDatabaseResult getCachedDatabase(GetCachedDatabaseRequest request) {request = beforeClientExecution(request);return executeGetCachedDatabase(request);}
public CreateJourneyResult createJourney(CreateJourneyRequest request) {request = beforeClientExecution(request);return executeCreateJourney(request);}
public DeleteDashboardRequest(String dashboardId) {setDashboardId(dashboardId);}
public int defaultMergePolicy() {return DEFAULT_MERGE_POLICY;}
public GetHealthCheckCountResult getHealthCheckCount(GetHealthCheckCountRequest request) {request = beforeClientExecution(request);return executeGetHealthCheckCount(request);}
public ChartStartBlockRecord(RecordInputStream in) {field_1_chart = in.readShort();}
public SeriesRecord(RecordInputStream in) {field_1_options = in.readShort();field_2_horiz_pos = in.readShort();field_3_vert_pos = in.readShort();field_cbo_id = in.readShort();field_5_horiz_pos = in.readShort();field_6_horiz_pos = in.readShort();field_7_horiz_pos = in.readShort();field_8_horiz_pos = in.readShort();field_9_options = in.readShort();}
public static CharFilter lookupFactory(String name) {return factory;}
public GetPublicKeyResult getPublicKey(GetPublicKeyRequest request) {request = beforeClientExecution(request);return executeGetPublicKey(request);}
public CreateLocalGatewayRouteTableVpcAssociationResult createLocalGatewayRouteTableVpcAssociation(CreateLocalGatewayRouteTableVpcAssociationRequest request) {request = beforeClientExecution(request);return executeCreateLocalGatewayRouteTableVpcAssociation(request);}
public static boolean toBoolean(String value) {return (value!= null && value.length() > 0);}
public Set<String> getAdded() {return Collections.unmodifiableSet(diff.getAdded());}
public GetSectionNamesResult getSectionNames(GetSectionNamesRequest request) {request = beforeClientExecution(request);return executeGetSectionNames(request);}
public CacheClustersResult listCacheClusters(ListCacheClustersRequest request) {request = beforeClientExecution(request);return executeListCacheClusters(request);}
public ListUnmergedPathsResult listUnmergedPaths(ListUnmergedPathsRequest request) {request = beforeClientExecution(request);return executeListUnmergedPaths(request);}
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {if (args.length == 1) {return evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0]);}if (args.length == 2) {return evaluate(ec.getRowIndex(), ec.getColumnIndex(), args[0], args[1]);}return ErrorEval.VALUE_INVALID;}
public int addSSTString(char s[], int len) {if (len < s.length) {addSST(s, len);return len;}throw new IllegalArgumentException("String " + s.length + " is too long to add to SST.length");}
public long getDeltaSearchMemoryLimit() {return deltaSearchMemoryLimit;}
public String toString() {String opName = getClass().getName();int index = opName.indexOf('$');opName = opName.substring(index+1, opName.length());return "<"+opName+"@"+tokens.get(index)+":\""+text+"\">";}
public String toFormulaString() {StringBuilder sb = new StringBuilder(64);boolean needsExclamation = false;if (externalWorkbookNumber >= 0) {sb.append('[');sb.append(externalWorkbookNumber);sb.append(']');needsExclamation = true;}if (sheetName!= null) {SheetNameFormatter.appendFormat(sb, sheetName);needsExclamation = true;}if (needsExclamation) {sb.append('!');}sb.append(nameName);return sb.toString();}
public E get(int index) {synchronized (mutex) {return delegate().get(index);}}
public byte[] getCachedBytes() {return cachedBytes;}
public DescribeConnectionsResult describeConnections() {return describeConnections(new DescribeConnectionsRequest());}
public void ensureCapacity(int min) {if (min > array.length) {int newCapacity = (int) (array.length * min);array = newCapacity;} else if (min == 0) {min = array.length;} else if (min == array.length * 2) {min = array.length * 2;} else if (min == array.length * 2) {min = array.length * 2;} else {min = min;}}
public DeleteLifecycleHookResult deleteLifecycleHook(DeleteLifecycleHookRequest request) {request = beforeClientExecution(request);return executeDeleteLifecycleHook(request);}
public final float maxBytesPerChar() {return maxBytesPerChar;}
public EmptyCellRectangleGroup(int rowIx, int colIx, int rowIx, int colIx) {_rowIx = rowIx;_colIx = colIx;_rowIx = colIx;_colIx = colIx;_rowIx = 0;_rowIx = 0;_columnIx = 0;_rowIx = -1;}
public int findEndOutlineGroup(int row) {RowRecord rowRecord = this.getRow( row );int level = rowRecord.getOutlineLevel();int currentRow = row;while (currentRow >= 0 && this.getRow( currentRow )!= null) {rowRecord = this.getRow( currentRow );if (rowRecord.getOutlineLevel() < level) {return currentRow + 1;}currentRow--;}return currentRow + 1;}
public String getEncoding() {return name;}
public void clearCachedResultValues() {cachedResultValues = null;}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[USESELFS]\n");buffer.append("   .options = ").append(HexDump.shortToHex(_options)).append("\n");buffer.append("[/USESELFS]\n");return buffer.toString();}
public DescribeDBDBClusterEndpointsResult describeDBDBClusterEndpoints(DescribeDBDBClusterEndpointRequest request) {request = beforeClientExecution(request);return executeDescribeDBDBClusterEndpoints(request);}
public RenameNodeNameResult renameNodeName(RenameNodeNameRequest request) {request = beforeClientExecution(request);return executeRenameNodeName(request);}
public Explanation explain(Explanation freq, long norm) {return SimilarityBase.this.explain(stats, freq, getLengthValue(norm));}
public DocTermsIndexDocValues(LeafReaderContext context, String fieldName) {this.context = context;this.fieldName = fieldName;}
public static int compareTo(Ref o1, Ref o2) {return o1.getName().compareTo(o2.getName());}
public int getWidth() {return width;}
public static double variance(double[] v) {double r = Double.NaN;if (v!=null && v.length > 0) {r = Math.sqrt( r * v);}return r;}
public UpdateCloudFrontOriginAccessIdentityRequestParametersResult updateCloudFrontOriginAccessIdentityRequestParameters(UpdateCloudFrontOriginAccessIdentityRequestParametersRequest request) {request = beforeClientExecution(request);return executeUpdateCloudFrontOriginAccessIdentityRequestParameters(request);}
public RenameCommand setDestinationPrefix(String destinationPrefix) {this.destinationPrefix = destinationPrefix;return this;}
public int availableBytes() throws UnsupportedDeviceBufferException {throw new UnsupportedDeviceBufferException();}
public Query notQuery() {throw new UnsupportedOperationException();}
public String toString() {return "StandardDirectoryReader.ReaderCommit(" + segmentsFileName + " files=" + files + ")";}
public FloatBuffer asReadOnlyBuffer() {FloatToByteBufferAdapter buf = new FloatToByteBufferAdapter(byteBuffer.asReadOnlyBuffer());buf.limit = limit;buf.position = position;buf.mark = mark;buf.byteBuffer.order = byteBuffer.order;return buf;}
public CreateLogCommand log() {return new CreateLogCommand(repo);}
public CreateDomainResult createDomain(CreateDomainRequest request) {request = beforeClientExecution(request);return executeCreateDomain(request);}
public int getWeight() {return this.weight;}
public ChartStartObjectRecord(RecordInputStream in) {field_1_chartObject = in.readShort();}
public void remove() {ConcurrentHashMap.this.remove(key);}
public DescribeMetricCollectionTypesResult describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest request) {request = beforeClientExecution(request);return executeDescribeMetricCollectionTypes(request);}
public UpdateFieldLevelEncryptionProfileResult updateFieldLevelEncryptionProfile(UpdateFieldLevelEncryptionProfileRequest request) {request = beforeClientExecution(request);return executeUpdateFieldLevelEncryptionProfile(request);}
public Ref getLeafRef() {return _leafRef;}
public int indexOf(Object object) {if (object!= null) {for (int i = 0; i < a.length; i++) {if (object.equals(a[i])) {return i;}}} else {for (int i = 0; i < a.length; i++) {if (a[i] == null) {return i;}}}return -1;}
public BulkScorer(Scorer scorer) {this.bulkScorer = scorer;}
public CreateRepositoryAuthorizationRequest() {super("cr", "2016-06-07", "CreateRepositoryAuthorization", "cr");setUriPattern("/repos/[RepoNamespace]/[RepoName]/authorizations/[AuthorizeId]");setMethod(MethodType.PUT);}
public TokenStream create(TokenStream input) {return new PortugueseLightStemFilter(input);}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[TABLE_DEF]\n");buffer.append("   .options = ").append(getOptions()).append("\n");buffer.append("[/TABLE_DEF]\n");return buffer.toString();}
public Enumeration<String> keys() {return new Iterator();}
public GetInstanceInstancesResult getInstanceInstances(GetInstanceInstancesRequest request) {request = beforeClientExecution(request);return executeGetInstanceInstances(request);}
public RefUpdate.Result getResult() {return result;}
public UpdateBasePathMappingResult updateBasePathMapping(UpdateBasePathMappingRequest request) {request = beforeClientExecution(request);return executeUpdateBasePathMapping(request);}
public UpdateDocumentResult updateDocument(UpdateDocumentRequest request) {request = beforeClientExecution(request);return executeUpdateDocument(request);}
public void setStreamFileThreshold(int threshold) {streamFileThreshold = threshold;}
public String toString() {StringBuilder buffer = new StringBuilder();buffer.append("[SSTInfo]\n");buffer.append("   .numstrings     = ").append(Integer.toHexString(getNumStrings())).append("\n");buffer.append("[/SSTInfo]\n");return buffer.toString();}
public void setCRC(int crc32) {crc = crc32;}
public RevFilter getRevFilter() {return revFilter;}
public QueryStringQuery(String prefix, Truncator truncator) {this.prefix = prefix;this.truncator = truncator;}
public byte readByte() {assert!eof();assert upto <= limit;if (upto == limit)nextSlice();return buffer[upto++];}
public DescribeWorkGroupResult describeWorkGroup(DescribeWorkGroupRequest request) {request = beforeClientExecution(request);return executeDescribeWorkGroup(request);}
public PutBlockPublicAccessConfigResult putBlockPublicAccessConfig(PutBlockPublicAccessConfigRequest request) {request = beforeClientExecution(request);return executePutBlockPublicAccessConfig(request);}
public String toString() {return "dels=" + Arrays.toString(item);}
public int getInt(int index) {checkIndex(index);return backingArray[offset + index];}
public CreateAlbumRequest() {super("CloudPhoto", "2017-07-11", "CreateAlbum", "cloudphoto");setProtocol(ProtocolType.HTTPS);}
public FileTreeIterator(File f) {return new FileTreeIterator(this, f);}
public final int getByte(int index) {int w;switch (index >> 2) {case 0:w = w1;break;case 1:w = w2;break;case 2:w = w3;break;case 3:w = w4;break;case 4:w = w5;break;default:throw new ArrayIndexOutOfBoundsException(index);}return (w >>> (8 * (3 - (index & 3)))) & 0xff;}
public GetTypeRegistrationResult getTypeRegistration(GetTypeRegistrationRequest request) {request = beforeClientExecution(request);return executeGetTypeRegistration(request);}
public TerminateInstancesResult terminateInstances(TerminateInstancesRequest request) {request = beforeClientExecution(request);return executeTerminateInstances(request);}
public DoubleBuffer duplicate() {return copy(this, mark);}
public OrConjunction(Conjunction c, int a, int b) {super(c);this.a = a;this.b = b;}
public void serialize(LittleEndianOutput out) {out.writeShort(sid);out.writeShort(_cbFContinued);if (_linkPtg == null) {out.writeShort(0);} else {int formulaSize = _linkPtg.getSize();int linkSize = formulaSize + 6;if (_unknownPostFormulaByte!= null) {linkSize++;}out.writeShort(linkSize);out.writeShort(formulaSize);out.writeInt(_unknownPreFormulaInt);_linkPtg.write(out);if (_unknownPostFormulaByte!= null) {out.writeByte(_unknownPostFormulaByte.intValue());}}out.writeShort(_cLines);out.writeShort(_iSel);out.writeShort(_flags);out.writeShort(_idEdit);if(_dropData!= null) {_dropData.serialize(out);}if(_rgLines!=
public GetAvailabilityOptionsResult getAvailabilityOptions(GetAvailabilityOptionsRequest request) {request = beforeClientExecution(request);return executeGetAvailabilityOptions(request);}
public long getOffset() {return offset;}
public static float[] grow(float[] array) {return grow(array, 1 + array.length);}
public ListMetricsResult listMetrics(ListMetricsRequest request) {request = beforeClientExecution(request);return executeListMetrics(request);}
public static int indexOfFirstRecord(int sid) {return indexOfFirstRecord(sid, 0);}
public DeleteVpnConnectionRouteResult deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest request) {request = beforeClientExecution(request);return executeDeleteVpnConnectionRoute(request);}
