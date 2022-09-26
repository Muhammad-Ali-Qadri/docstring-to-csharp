public override void Serialize(ILittleEndianOutput out1){out1.WriteShort(field_1_venter);}
public virtual void addRange(IList<E> src, IList<E> elements){addRange(src, 0, elements.Length);}
public override void WriteByte(int b){if (m_len >= m_buf.Length){Resize(m_len + 1);}UnsafeWriteByte(b);}
public virtual string GetObjectId(){return objectId;}
public void DeleteDomainEntry(DomainEntry domainEntry){DeleteDomainEntry(domainEntry);}
public override long BytesUsed(){return delegate1.BytesUsed();}
public virtual IPolicy Policy { get; private set; }
public POIFSFileSystemFileSystem Create(FileSystem fileSystem){return (POIFSFileSystem)Create(fileSystem);}
public override void Initialize(Address address){if (address.Length!= BlockFile.DEFAULT_BLOCK_SIZE){throw new InvalidOperationException("Block file size is not supported.");}this.m_blockFile = address.Pointer;this.m_blockOffset = address.Length;this.m_blockFile = file.Open();}
public string SubmodulePath { get; set; }
public virtual IList<Ingress> GetIngestions(){return ingestions;}
public TokenManager(ICharStream input){this.input = input;this.state = LuceneLexerState.INITIAL;this.index = 0;this.offset = 0;this.type = 0;this.val = 0;this.pos = 0;this.type1 = 0;this.type2 = 0;this.type3 = 0;this.type4 = 0;this.type5 = 0;this.type5 = 0;}
public override Sharpen.Iterator<T> GetIterator(int shard){return shard.GetIterator(this);}
public ModifyStrategyRequest(): base(HttpMethod.GET){Path = string.Format(CultureInfo.InvariantCulture, "strategyId={0}", StrategyId);}
public override bool ready(){return false;}
public String GetOptRecord(){return optRecord;}
public override int ReadLengthBytes(byte b){return buf.ReadUpto(ReadLengthBytes(b));}
public IEnumerator<NLPSentenceBreak> GetSentenceBreakIterator(int start, int end){return GetSentenceBreakIterator(start, end);}
public virtual void print(string str){print(str);}
public NotImplementedFunctionException(string functionName, Exception cause){Debug.Assert(functionName!= null);}
public virtual E value(){return this.nextEntry().value;}
public override int Read(byte[] buf, int offset, int count){int end = offset + count;for (int i = offset; i < count; i++){byte b = buf[i];if (b[i] == 0){break;}}return end - pos;}
public virtual void Tag(string queue, int flags){if (flags & FLAG_QUEUE_FLAG_EXCLUSIVE){int q = q << 13;q.Flags = flags & ~FLAG_QUEUE_FLAG_EXCLUSIVE;}else{q = string.Format(CultureInfo.InvariantCulture, "tag {0} with {1} flags", flags);}
public virtual void remove(){lock (this._enclosing){int oldSize = this._enclosing._size;this._enclosing.remove(this);this._enclosing._size = oldSize;this._enclosing.notifyDataSetRemoved();this._enclosing.notifyDataSetRemoved();this.declosing._size = oldSize;this.declosing._size = oldSize;}}
public virtual ModifyCacheSubnetGroupResponse ModifyCacheSubnetGroup(ModifyCacheSubnetGroupNameResponse result){return ModifyCacheSubnetGroup(result);}
public virtual void SetLanguageAndVariantParameters(string language){this.language = language;this.variant = "DE";}
public virtual void DeleteDocumentationVersion(){DeleteVersion(null);}
public virtual bool Equals(object o){if (o is FacetLabel){return FacetLabel.Equals(((FacetLabel)o).FacetLabel);}return false;}
public virtual InstanceAttributes GetInstanceAttributes(){return InstanceAttributes.InstanceAttributes;}
public Polygon Create(IShape shape, int x, int y, int z, int w, int h, int x, y, char c){if (_isHSSF){_isHSSF = true;_shape = shape;}return _shape;}
public Sheet GetSheetAt(int index){return _sheetIndexToString(index);}
public Dashboards { get; private set; }
public void Associate(AWSAccount account){Service.AssociateAWSAccount(account);}
public void AddBlanks(IList<Blank> blanks){_blanks = blanks;}
public virtual string quote(string s){return quote(s, CultureInfo.InvariantCulture);}
public override void Write(int v){Write(v);}
public override void Set(E value){base.Set(value);}
public IceServerConfiguration GetServerConfiguration(){return IceServerConfigurationHelper.GetServerConfiguration(this.GetServer());}
public virtual string ToString(){return ToUniversalString(this);}
public override string ToString(){return this.ToString(CultureInfo.InvariantCulture);}
public virtual void IncrementRefCount(int refCount){count += 1;}
public virtual void UpdateConfigurationSetSendingEnabled(ConfigSet sendingEnabled){_configurationSet = sendingEnabled;}
public virtual int GetXBATOffset(){return 0;}
public virtual BigInteger Multiply(BigInteger number, int power){return Multiply(number, power);}
public virtual string ToString(){return GetDescription();}
public CredentialFetcher(CredentialsFetcher credentialsFetcher){_credentialsFetcher = credentialsFetcher;}
public ProgressMonitor(ProgressMonitor other){this.other = other;}
public virtual void Reset(Parser parser){m_state = STATE_INIT;}
public virtual E previous(E e){return list.previous(e);}
public virtual string GetNewPrefix(){return newPrefix;}
public virtual int Get(int index){return map.Get(index);}
public virtual IList<string> GetUniqueStems(string word){return GetUniqueStems(word, true);}
public virtual GatewayResponses GetGatewayResponses(){return gatewayResponses;}
public override void SetFilePointer(long filePointer){filePointer = filePointer;}
public override void Skip(int count){Skip0(count);}
public BootstrapActionConfig SetBootstrapActionConfig(BootstrapActionConfig config){this.m_bootstrapActionConfig = config;}
public override void Serialize(ILittleEndianOutput out1){out1.Write(shapeid);}
public virtual int lastIndexOf(string str){return lastIndexOf(str, 0, str.Length - str.Length);}
public virtual void append(E e){throw new System.NotImplementedException();}
public void Unset(section section){Unset(section.Value);}
public virtual string GetTag(){return null;}
public void SubRecordsAdd(Record record){Add(record);}
public virtual void remove(object o){iterator.remove(o);end++;}
public Filter CreateDoubleMetaphoneFilter(Int32sRef operands){return new DoubleMetaphoneFilter(operands);}
public override long GetSize(){return file.GetSize();}
public void SetValue(String newValue){object temp;if (this.lastValueWasThrown)throw new InvalidOperationException("Property value was never returned by the ReferenceManager instance (it was never returned by the ReferenceManager instance)");this.lastValueWasThrown = newValue;this.isValueSet = true;this.isValueSet2 = true;this.isValueSet3 = true;this.isValueSet4 = true;this.isValueSet5 = false;this.isValueSet4 = true;}
public virtual ContentSourcePair<string, IContentSource> CreatePairs(string[] sourceIds, int[] sourceOffsets){return CreatePairs(sourceOffsets, sourceOffsets.Length);}
public int valueAt(int index){return array[index];}
public virtual RepositoryRequest SetRequestParameters(RepositoryRequest request){var options = new InvokeOptions();options.RequestMarshaller = RepositoryRequestMarshaller.Instance;options.ResponseUnmarshaller = SetRequestParametersUnmarshaller.Instance;return Invoke<RepositoryRequest>(request, options);}
public virtual bool IsDeltaBaseAsOffset(DeltaBase base){return IsDeltaBaseAsOffset(base);}
public virtual void pop(){remove(this.tail);}
public virtual MergeShardsResponse Merge(MergeShardsResponse Sharpen) {return Merge(null, Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.SharpenDefault.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.SharpenDefault.SharpenDefault.SharpenDefault.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.Sharpen.SharpenSharpen.Sharpen
public virtual AllocateHostedConnectionResponse AllocateHostedConnection(AllocateHostedConnectionRequest request){var options = new InvokeOptions();options.RequestMarshaller = AllocateHostedConnectionRequestMarshaller.Instance;options.ResponseUnmarshaller = AllocateHostedConnectionResponseUnmarshaller.Instance;return Invoke<AllocateHostedConnectionResponse>(request, options);}
public int startOfRange(int start, int end){return start + (end >= 0)? start : 0;}
public virtual WeightedTerm[] GetWeightedTerms(IQuery query){WeightedTerm[] unweightedTerms = new WeightedTerm[_maxTermSize];foreach (WeightedTerm w in unweightedTerms){_maxTermSize *= -1;}return unweightedTerms;}
public virtual java.nio.ByteBuffer compact(java.nio.ByteBuffer byteBuffer){return new java.nio.ReadWriteByteBuffer(byteBuffer, 0, byteBuffer.length);}
public override void Decode(int n){Decode(n, m_buf, _stndStart, _stndLength);}
public string GetName(){return path.GetName();}
public virtualNotebookInstanceLifecycleConfig GetNotebookInstanceLifecycleConfig(){return _apic.GetNotebookInstanceLifecycleConfig();}
public string GetAccessKeySecret(){return _accessKeySecret;}
public VPNConnection(string VPNEndpoint){_vhostEndpoint = VPNEndpoint;}
public virtual VoiceCollection Voice(){return Sharpen.Collections.UnmodifiableList(voices);}
public virtual IList<Execution> GetMonitoredExecutions(){return list.Empty();}
public SetVaultJobKey(string vaultName, string jobId){_vaultName = vaultName;_jobId = jobId;}
public escherRecord At(int index){return escherRecords[index];}
public virtual DescribeAppSummariesResponse DescribeAppSummaries(DescribeAppSummariesRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeAppSummariesRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeAppSummariesResponseUnmarshaller.Instance;return Invoke<DescribeAppSummariesResponse>(request, options);}
public void DeleteSmsChannel(SnsChannel message){this.SmsChannel = message;}
public virtual TrackingRefUpdate GetTrackingRefUpdate(){return trackingRefUpdate;}
public virtual bool print(bool b){return b;}
public virtual ICharTerm GetFirstChild(){return (ITokenTerm)GetFirstChild().CharTerm;}
public int workingTreeIndex { set; }
public override void Read(Record record){_in.Read(record.area_data);}
public GetThumbnail request, with default parameters set to HTTPS. The default parameters are set to { "https":" }
public virtual ICollection<VPCAttachment> GetVPCAttachments(TransitGateway gateway){return getVPCAttachments(gateway, null);}
public streaming configuration for an Amazon Chime Voice Connector.Connector.
public virtual int range(int start, int end){return end - start;}
public virtual string ToDo(){return GetHashCode().ToString();}
public virtual E firstInList(E @object){lock (mutex){return c.firstInList(mutex);}}
public virtual CreateWorkspacesResponse CreateWorkspaces(CreateWorkspacesRequest request){var options = new InvokeOptions();options.RequestMarshaller = CreateWorkspacesRequestMarshaller.Instance;options.ResponseUnmarshaller = CreateWorkspacesResponseUnmarshaller.Instance;return Invoke<CreateWorkspacesResponse>(request, options);}
public virtual NGit.Storage.File.Record GetRecord(){return this._enclosing.GetRecord(this.name);}
public virtual RepositoryCollection GetRepositories(){return repositories;}
public virtual java.util.SparseArray newSparseArray(int capacity){object[] a = new object[capacity];Array.Copy(array, 0, a, 0, _array.Length, _array.Length);return a;}
public FilterType filterType(); return new HyphenatedWordFilterType(filterType);}
public virtual Distribution Create(Tags tags){return Create(tags, DistributionOptions.None, null);}
public java.io.RandomAccessFile randomAccessFile(string file) throws IOException{throw new System.NotImplementedException();}
public virtual void DeleteImage(File file){Delete(file.FullName, file.GetFile());}
public override string ToString(){return "0x" + (long)toHexString(fromString());}
public virtual UpdateDistributionResponse UpdateDistribution(UpdateDistributionRequest request){var options = new InvokeOptions();options.RequestMarshaller = UpdateDistributionRequestMarshaller.Instance;options.ResponseUnmarshaller = UpdateDistributionResponseUnmarshaller.Instance;return Invoke<UpdateDistributionResponse>(request, options);}
public HSSFColor Get(int index){return GetColorAt(index);}
public virtual void Evaluate(IToken token){_token = token;}
public override void Serialize(ILittleEndianOutput out1){out1.WriteShort(this.GetType().Name);out1.WriteByte(_order);}
public virtual DescribeDatabaseEngineVersions(){return DescribeDatabaseEngineVersions(null, null);}
public FontIndex (int index){this.m_fontIndex = index;}
public override object ToByteArray(ICharSequence input){return ConvertToByteArray(input, 0, input.Length);}
public virtual void Upload(File file){this.UploadingFile = file;this.Canceled = true;this.Progress = null;this.MaxUploadCount = 0;this.ProgressTo = null;this.ProgressTo = null;this.ProgressTo = null;this.ProgressTo = null;this.ProgressTo = null;this.ProgressTo = null;this.ProgressTo = null;this.ProgressTo = null;this.ProgressTo = null;this.Spinner.SetCurrentState(this.NumberOfStoredPaths);this.Drawing.SetCurrentState(this.Drawing.CurrentState);this.State = this.Drawing.CurrentState;this.IsNew = false;this.StateOf = this.TransitionsOf.EndOfStream;this.StateOf = this.TransitionsOf.EndOfStream;this.StateOf = this.TransitionsOf.Of;this.StateOf = this.TransitionsOf.Of;this.StateOf = this.TransitionsOf.Of;this.TransitionsTo = this.OfDrawing.SetCurrentState(this.Drawing.CurrentState
public virtual IList<HiddenToken> GetLeftHiddenTokens(){return GetLeftHiddenTokens(true);}
public virtual bool Equals(AutomatonQuery query){return query.Equals(this);}
public SpanClause CreateWeightBySpanQuerySpanClause(){return CreateWeightBySpanQuerySpanClause();}
public virtual Stash CreateStash(StashConfig config){return new Stash(config, this);}
public virtual IFieldInfos GetFieldInfos(string fieldName){return fieldInfos;}
public virtual IEventSource GetEventSource(){return source;}
public virtual AnalysisDetail GetAnalysisDetail(){return detail;}
public virtual void CancelUpdateStack(){_updateStack = null;}
public virtual void ModifyLoadBalancerAttribute(int loadBalancerId){ModifiesLoadBalancerAttribute(loadBalancerId, true);}
public virtual void SetInstanceProtection(bool protect){base.SetInstanceProtection(protect);}
public virtual void Modify(Record record){this._enclosing.Modify(record);}
public virtual void SetRanges(ICharSequence range){m_ranges = range;}
public FetchLibrariesRequest(Collection<string> defaultParams){return new FetchLibrariesRequest(defaultParams);}
public virtual bool Exists(){return Exists();}
public virtual void SetOutput(Stream outputStream){_output = outputStream;}
public CSKClusterRequest(): base(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
public TimeConstraint(TimeConstraint constraint){return constraint;}
public virtual IList<string> GetParentPaths(){return Sharpen.Collections.UnmodifiableList(parentPaths);}
public virtual CacheSubnetGroupsResponse CacheSubnetGroups(string cacheGroupName){return _cacheSubnetGroups;}
public formula_flag_t set(Boolean value){_value = value;}
public override bool ShouldReuseObjects(){return false;}
public virtual IAddErrorNode AddErrorNode(IErrorNode errorNode){return ErrorNode.Create(errorNode);}
public override StemFilter Create(int argc, StemFilter argf){if (argc!= null){return Create(argc, 0, argc.Length);}return new LatvianStemFilter(this, argf.Start, argf.End, argf.Options, argf.Options, argf.OptionsAndReturnValues);}
public virtual void Unsubscribe(object o){if (o == null){throw new ArgumentNullException("o");}Subscription o = null;}
public TokenFilterFactory(string name, params object[] args){return new TokenFilterFactory(name, args);}
public new AddAlbumPhotosRequest(params){return new AddAlbumPhotosRequest(params);}
public ThreatIntelSet Retrieve(int threatIntelSetId){return _threatIntelSetInstances.Get(threatIntelSetId);}
public override TreeFilter Clone(){return this;}
public override bool IsArmmenianStemmer(object o){return base.IsArmmenianStemmer(o);}
public virtual bool isArray(){return base.isArray();}
public virtual UpdateContributorInsightsResponse UpdateContributorInsights(UpdateContributorInsightsRequest request){var options = new InvokeOptions();options.RequestMarshaller = UpdateContributorInsightsRequestMarshaller.Instance;options.ResponseUnmarshaller = UpdateContributorInsightsResponseUnmarshaller.Instance;return Invoke<UpdateContributorInsightsResponse>(request, options);}
public void UnwriteProtect(HSSFWorkbook wb){wb.UnwriteProtect(null);}
public bool SetDups(bool b){return true;}
public virtual RequestSpotInstancesResponse RequestSpotInstances(RequestSpotInstancesRequest request){var options = new InvokeOptions();options.RequestMarshaller = RequestSpotInstancesRequestMarshaller.Instance;options.ResponseUnmarshaller = RequestSpotInstancesResponseUnmarshaller.Instance;return Invoke<RequestSpotInstancesResponse>(request, options);}
public override byte[] GetBytes(){return base.GetBytes();}
public virtual ContactAttributes GetAttributes(){return contactAttributes;}
public override string ToString(){return base.ToString();}
public virtual IList<TextTranslationJob> GetTextTranslationJobs(){return translationJobs;}
public virtual ContactMethodListing GetContactMethodListing(){return GetContactMethodListing(null);}
public int GetFunctionIndex(String name){int index;try{index = _functions.GetIndex(name);}catch (IndexOutOfRangeException){return -1;}}
public virtual AnomalyDetectorInformation GetAnomalyDetectorInformation(){return null;}
public virtual void Insert(ObjectId id){this.e = id;this.r = db.Get(id);}
public override int size(){return this._enclosing._size;}
public virtual void ImportMedia(MediaStreamStream stream){ImportMedia(stream);}
public virtual void Update(int hookId){this.hookId = hookId;}
public virtual int ReadNumber(){return _in.ReadUByte();}
public virtual EncryptionConfig Get(string name){return null;}
public virtual DescribeGuardDutyDetectorResponse DescribeGuardDutyDetector(DescribeGuardDutyDetectorRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeGuardDutyDetectorRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeGuardDutyDetectorResponseUnmarshaller.Instance;return Invoke<DescribeGuardDutyDetectorResponse>(request, options);}
public virtual void ReportInstanceStatus(){_instanceStatus = InstanceStatus.NOT_APPLICABLE;}
public virtual void DeleteAlarm(Alarm altr){Alarm c = (Alarm)Activator.CreateInstance(this.ctx, alarmName);c.Delete();}
public PortugueseStemFilter(){return new PortugueseStemFilterAnonymousInnerClassHelper(this);}
public FtCblsSubRecord Create(FtCblsSubRecord other){FtCblsSubRecord temp = new FtCblsSubRecord();temp.RecordType = this.GetType();temp.MaxRecordSize = (other.MaxRecordSize);}
public virtual void Clear(){cache.Clear();}
public virtual IPAddress GetDedicatedIpAddress(){return _ip;}
public virtual string GetPriorityString(){return GetPriorityAsString(null);}
public virtual IList<StreamProcessor> GetStreamProcessors(){return streamProcessors;}
public virtual void DeleteLoadBalancerPolicy(string loadBalancerName, string policyName){DeleteLoadBalancerPolicy(loadBalancerName, policyName, null);}
public void SetWindowProtections(int protections){_windowProtections = protections;}
public java.nio.CharStream newUnbufferedCharStream(bufferSize){return new java.nio.ReadOnlyCharStream(bufferSize);}
public virtual DescribeOperationsResponse DescribeOperations(){return DescribeOperations(null, null);}
public override void CopyTo(byte[] array, int offset, int length){if (_size == 0){return;}int blen = _size;for (int i = offset; i < blen; i++){b[i] = _data[i];}}
public override void Read(RecordInputStream in1){try{Record in1.Read(recordOutput);}catch (IOException e){throw new RuntimeException(e);}}
public virtual void StopWorkspaces(){m_workspaces.Clear();}
public override void Close(){_writer.Release();}
public virtual IList<MatchmakingRuleSet> GetMatchmakingRuleSets(Matchgroup matchgroup){return internal.GetMatchmakingRuleSets(matchgroup.RuleIds);}
public virtual Pronunciation GetPronunciation(int wordID){int result;for (wordID = 0; wordID < WordCount; wordID++){result = _pronunciation[wordID];}return result;}
public string getPath(){return path;}
public virtual float GetSquaredError(){return devSqrt(a)? devSqrt(a) : devSqrt(a=0)? devSqrt(a) : devSqrt(a=1)? devSqrt(a)? devSqrt(a) : devSqrt(a=1)? devSqrt(a)? devSqrt(a) : devSqrt(a=0)? devSqrt(a) : devSqrt(a)? devSqrt(a)? devSqrt(a)? devSqrt(a) : devSqrt(a=0)? devSqrt(a) : devSqrt(a=1)? devSqrt(a)? devSqrt(a) : devSqrt(a)? devSqrt(a)? devSqrt(a)? devSqrt(a) : devSqrt(a)? devSqrt(a)? devSqrt(a) : devSqrt(a)? devSqrt(a)? devSqrt(a) : devSqrt(a)? devSqrt(a) : dev
public ResizeEvent(Type ofObject){return ResizeEvent(this);}
public virtual bool Greedy(int decision){return greedy;}
public virtual string end(){return end;}
public Sheet GetSheet(SheetNameRecord sheet){return _sheet.GetSheet(sheet.SheetNameRecord);}
public override int GetReadIndex(){return _rc4.Xor(_index);}
public virtual bool Equals(Terms terms, float score){return terms!= null? Equals(Terms, maxTerms) : false;}
public virtual string Normalize(string str){return Normalize(str.ToCharArray());}
public override void Serialize(ObjectOutput out1){out1.Write(Serialize(this));}
public bool setExactOnly(){return this.exactOnly;}
public virtual void SetAttributeNames(string @name, string @type){m_name = @name;m_keyType = @type;}
public virtual Assignment GetAssignment(){return _assignment;}
public virtual bool HasObjectWithId(ObjectId id){return HasObject(id);}
public bool IncludeAllGroupsInSearch(bool includeAllGroupsInSearch){return _groupSearchOptions.IncludeAllGroupsInSearch;}
public bool IsMultiValuesOn(int j){return _order == null;_order = j;}
public virtual int RowCount(IRowRecord row){return _rc4.XOrRecord.GetCellCount(row, 0);}
public void DeleteAmazonGuardDutyVoiceConnector(AmazonGuardDutyConnector requester){DeleteAmazonGuardDutyConnector(requester);}
public virtual void DeleteLifecyclePolicy(int id){if (id == 0){throw new System.ArgumentException("id cannot be zero if id cannot be negative");}if (id == 0){throw new System.ArgumentException("id cannot be zero");}lifecyclePolicies.Remove(id);}
public override void write(byte b){throw new System.NotImplementedException();}
public virtual RebaseGetResult(){return rebase.GetResult();}
public override int size(int maxSaturation){return this._enclosing.size(maxSaturation);}
public Dashboards { get; private set; }
public Segment CreateSegment(Segment segment){this.segment = segment;}
public String ToString(){return HSSFErrorConstants.GetText(hssF_1);}
public virtual UndeletedList GetUndeletedList(){return _undeleted;}
public virtual string ToString(){return GetEnumName();}
public virtual Scheduler Clone(){return this;}
public override void SetDictionary(IDictionary<K, V> dictionary){base.SetDictionary(dictionary);}
public virtual void append(char c){append0(c);}
public virtual StacksList<Stack> GetStackInfoList(){return stacks.GetStackInfoList();}
public virtual double GetAvedev(int vector){return computeAvedev(vector);}
public virtual DescribeByoipCidrsResponse DescribeByoipCidrs(DescribeByoipCidrsRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeByoipCidrsRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeByoipCidrsResponseUnmarshaller.Instance;return Invoke<DescribeByoipCidrsResponse>(request, options);}
public virtual GetDiskDetailsResponse GetDiskDetails(GetDiskDetailsRequest request){var options = new InvokeOptions();options.RequestMarshaller = GetDiskDetailsRequestMarshaller.Instance;options.ResponseUnmarshaller = GetDiskDetailsResponseUnmarshaller.Instance;return Invoke<GetDiskDetailsResponse>(request, options);}
public ClusterParameterGroupGroup(string name, List<string> args){return new ClusterParameterGroupGroup(name, args, 0, args.Length);}
public java.nio.CharBufferBuffer wrap(char[] array_1){return new java.nio.CharArrayBuffer(array_1);}
public override string GetType(){return type;}
public virtual GetServerGroupResponse GetServerGroup(GetServerGroupRequest request){var options = new InvokeOptions();options.RequestMarshaller = GetServerGroupRequestMarshaller.Instance;options.ResponseUnmarshaller = GetServerGroupResponseUnmarshaller.Instance;return Invoke<GetServerGroupResponse>(request, options);}
public string pattern { get; set; }
public void SetValue(Object newValue){object temp;if (this.objectValue == null){throw new ArgumentNullException("objectValue is null");}this.objectValue = newValue;}
public virtual StringBuilder Stem(string word){int result = Stem(word);return result;}
public RenameFaceRequest(PersonName faceName, string newUrl){_newUrl = faceName;_newUrl = newUrl;}
public virtual char requireChar(int arg){if (arg < 0){throw new ArgumentException(arg, "arg");}char c = 'a' + arg;if (c >= 0){c = 'a' + c;}if (c <= 127){c = 'a' + c;}else{c = 'a' + c;}}return c;}
public virtual string ToString(IFormatProvider provider){return "Unknown Tree Type: " + GetType().FullName;}
public virtual string Deleted(int id){return _delete(id, true);}
public virtual IList<LogRecord> GetLogs(string webhookId){var options = new InvokeOptions();options.RequestMarshaller = GetMessageMarshaller.Instance;options.ResponseUnmarshaller = GetMessageUnmarshaller.Instance;return Invoke<IList<LogRecord>(webhookId, options);}
public override string GetUnlockCode(){return "J2N.Runtime.GetUnlockCode(this);";}
public void SetTagsResourceId(int[] tags){_tags = tags;}
public int id(char c){if ((c is GB2312) && (c.id1 == 0x7F)){return c.id1;}return -1;}
public virtual NGit.BatchUpdateCommand AddCommand(ICollection<ReceiveCommand> commands){return this.AddCommand(commands);}
public bool IsExternSheet(int sheet){return GetSheetIndex(sheet);}
public override bool Equals(object o){if (o == this){return true;}return false;}
public virtual BooleanQuery BuildBooleanQuery(AnyQueryNode node){return BuildBooleanQuery(node.Field_1_value, node.Value, node.IsLongQuery, node.IsFixedQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsUnsignedQuery, node.IsUnsignedQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsOffsetQuery, node.IsUnsignedQuery, node.IsOffsetQuery,
public virtual StreamProcessor GetStreamProcessor(){return streamProcessor;}
public virtual Permissions GetPermissions(DashboardEntry request){var options = new InvokeOptions();options.RequestMarshaller = GetRequestMarshaller.Instance;options.ResponseUnmarshaller = GetResponseUnmarshaller.Instance;return Invoke<Permissions>(request, options);}
public virtual Ref Get(object @object){return @object;}
public override long Size(){return _size;}
public virtual SuggestListResponse Suggest(Domain domain, string field_1, List<Suggestion> suggestions){return Suggest(domain, field_1, suggestions);}
public virtual StackEvent[] GetStackEvents(){return stackEvents;}
public RuleSet.RuleAt(int index){return _rules[index];}
public ResolverResolver(){return new _ResolverResolver_132(this);}
public SeriesIndexRecord(Stream in1){return new SeriesIndexRecord(in1);}
public GetStylesRequest(): base(){return new GetStylesRequest(null, null);}
public override void Serialize(ILittleEndianOutput out1){out1.WriteShort(field_1_gridset_flag);}
public bool Equals(Toffs other){return other!= null? Equals(this, other) : false;}
public virtual GatewayGroup CreateGatewayGroup(GatewayGroup gatewayGroup){return gatewayGroup;}
public virtual ParticipantConnection CreateParticipantConnection(ParticipantConnection connection){return connection;}
public Irr coefficient(incomes): base(income){return Irr;}
public void RegisterExistingWorkspaceDirectory(FilePath workspaceDirectory){_workspaceDirectory = workspaceDirectory;}
public virtual void AddCommit(ICommit commit){revertList.AddItem(commit);}
public virtual float Evaluate(int row, int column){return _inumVE[row][column];}
public virtual E last(E value){return last(value.GetEnumerator());}
public override int ReadShort(){return delegate1.ReadShort();}
public virtual ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest request){return Invoke<ModifySnapshotAttributeResponse>(request, null);}
public virtual IList<string> GetPaymentIDsForBonus(string bonusId){return GetStandardPaymentIDsForBonus(bonusId, null);}
public int valueAt(int index){return _string.IndexOf(m_string, index);}
public TokenFilter Create(TokenStream stream){return new TokenFilter_546(stream, 0, stream.Length);}
public string getPath(){return path;}
public virtual void Start(){if (_s3State!= null){_s3State.StartUpload(null, _s3State, _s3State.options, null);_s3State = null;_s3State = null;}this.pendingInit = true;this.uploadId = _s3State.nextMultipartUploadId;this.name = null;this.m_spaceId = null;this.m_eof = false;}
public virtual void insert(string str, int offset, char[] buffer, int length){if (offset < 0){throw new ArgumentException("offset " + offset + " is not supported.");}m_buf[offset] = str;}
public virtual IList<int> Decode(IList<int> blocks){return Decode(blocks, 0, blocks.Length);}
public ElisionFilter(TokenStream input){return new ElisionFilter(input);}
public virtual void EatCells(IRow row, IRow column, IRemap array){EatCells(row, column, remap array);}
public virtual IToken Get(int index){return lexer.Get(indexes[index]);}
public virtual string Clone(){return "L";}
public FolderInformation GetFolderInformation(){return folderInformation;}
public virtual void add(object o){object n = this._enclosing.add(o);if (n == list.size){throw new java.util.NoSuchElementException();}if (head < _list.size){addItem(o);}else{addItem(o);}}
public override void Initialize(CollectorConfig config){base.Initialize(config);}
public virtual BuildRule CreateBuildRule(){return new BuildRule(this);}
public override void SetBaseReference(AreaEval areaEval){_baseRef = areaEval.GetBaseReference();}
public drawing.OnCreate(startAt, endAt, endAt, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition, endPosition
public void Reset() {iterator = null;}
public virtual void Reset(Decoder decoder){this.decoder = decoder;}
public virtual void SetReader(TextReader reader){this.reader = reader;}
public virtual CodeRepository GetCodeRepository(){return _codeRepo;}
public DBSubnetGroup(string dbSubnetGroupName){return (new DBSubnetGroup(dbSubnetGroupName));}
public virtual void SetOldBranchName(string newBranchName){m_oldBranchName = newBranchName;}
public virtual bool DeleteBranch(){return false;}
public virtual void Stop(){this.phase = Done;this.death = null;this.ended = true;}
public virtual void SetSecondaryProgress(float value){secondaryProgress = value;}
public void Clear(){_buf.Clear();}
public string getRawPath(){return getRawPath(true);}
public virtual SourceAccount GetSourceAccount(){return sourceAccount;}
public virtual ExportJob CreateExportJob(ExportJob job){return job;}
public IPPool CreateDedicatedIpPool(){return (IPPool)CreatePool(this);}
public bool Equals(Style other){return style == other.style;}
public virtual void ReleaseHosts(){foreach (Host host in _hosts){ReleaseHost();}}
public override bool Equals(object o){return this.Equals(o);}
public virtual void SetReferenceLogMessage(string m_message){this.m_referenceLogMessage = m_message;}
public override void ReadStreamID(StreamID record){_in.ReadInt32(record.StreamID);}
public virtual RecognizeCarResponse RecognizeCar(RecognizeCarRequest request){return RecognizeCar(request, null);}
public override byte order(){return _order;}
public virtual int GetAheadCount(){return _aheadCount;}
public virtual bool IsNewFragment(ICharSequence text){return this.text.Length == 0;}
public CloudFrontOriginAccessIdentity CloudFrontOriginAccessIdentity { get; private set; };
public override bool Equals(LabelSymbol symbol){return this.Equals(symbol.Label);}
public virtual void Delete(TransitGateway gateway){Delete(gateway.GatewayId);}
public virtual void Grow(int size){for (int i = size; i < size; i++){System.Array.Copy(array, i, array, i.ArrayOffset + i, array.Length - i);i.Length = i.Length;}}
public virtual CreateCloudPhotoTransactionResponse CreateCloudPhotoTransactionResponse(CreateCloudPhotoTransactionRequest request){var options = new InvokeOptions();options.RequestMarshaller = CreateCloudPhotoTransactionRequestMarshaller.Instance;options.ResponseUnmarshaller = CreateCloudPhotoTransactionResponseUnmarshaller.Instance;return Invoke<CreateCloudPhotoTransactionResponse>(request, options);}
public virtual void SetPersonIdent(string personIdent){m_personIdent = personIdent;}
public virtual LaunchTemplateData GetLaunchTemplateData(string appName){return null;}
public ProfilingATNSimulator(ATNSimulator instance){this.m_instance = instance;}
public QQ names and indexes fields {{ { value = names }; }
public virtual PromoteClusterResponse PromoteCluster(PromoteClusterRequest request){var options = new InvokeOptions();options.RequestMarshaller = PromoteClusterRequestMarshaller.Instance;options.ResponseUnmarshaller = PromoteClusterResponseUnmarshaller.Instance;return Invoke<PromoteClusterResponse>(request, options);}
public virtual CapacityReservationDetail GetCapacityReservationDetail(){return GetInnerCapacityReservationDetail(null);}
public virtual string SearcherName { get; private set; }
public virtual void IncrementToken(){index++;}
public override void Serialize(ILittleEndianOutput out1){out1.WriteShort(this.GetType().Name);out1.WriteByte(_order);}
public virtual int32s decode(int bits){return decode(bits, 0);}
public virtual bool Expected(IToken token){return Current.Type == typeof(EofToken), "expected");}
public virtual UpdateStreamResponse UpdateStream(UpdateStreamRequest request){var options = new InvokeOptions();options.RequestMarshaller = UpdateStreamRequestMarshaller.Instance;options.ResponseUnmarshaller = UpdateStreamResponseUnmarshaller.Instance;return Invoke<UpdateStreamResponse>(request, options);}
public override Eval ErrorEval Evaluate(double value){if (double.IsNaN(value)){return ErrorEval.NA;}return Evaluate(value);}
public virtual string ToString(){return GetCanonicalName();}
public virtual IList<Assignment> GetAssignments(int HIT_ID){return HIT_Assignments.Values;}
public virtual void DeleteAccessControlRule(AccessControlRule rule){_accessControlRule = rule;}
public virtual Arc GetFirstArc(){Arc arc = (Arc)FirstArc();return arc;}
public virtual int64s(IEnumerator<int64s> iterator){return new int64s(this._enclosing);}
public virtual void skip(int count){skip(count * m_recs, 0, count);}
public virtual Dictionary<string, List<AdvertisedReference>> GetAdvertisedReferences(){return _advertisedReferences;}
public virtual UpdateApiKeyResponse UpdateApiKey(UpdateApiKeyRequest request){var options = new InvokeOptions();options.RequestMarshaller = UpdateApiKeyRequestMarshaller.Instance;options.ResponseUnmarshaller = UpdateApiKeyResponseUnmarshaller.Instance;return Invoke<UpdateApiKeyResponse>(request, options);}
public virtual BinaryReader GetInputStream(Stream stream){return new BinaryReader(stream, this);}
public void SetToEmpty(int[] a){Array.Clear(a);}
public virtual Amazon GuardDutyDetectorVersion Update(AmazonGuardDutyDetectorVersion version){return new AmazonGuardDutyDetectorVersion(version);}
public virtual void Resize(){view.Resize(getMaximumSize());}
public RevFlagSet(RevFlag flag){RevFlagSet(flag);foreach (RevFlag flag in flag){RevFlag(flag);}}
public virtual int size(){return this._enclosing._size;}
public override long Get(){return buf.Get();}
public virtual void writeLong(long value){throw new System.NotImplementedException();}
public virtual NGit.Turkish.LowercaseFilter Set(){return _filter;}
public virtual MatchResult Match(int level, Tree tree){return Match(level, tree);}
public virtual void AddWord(string word){AddWord(word);}
public Merger(){return this;}
public virtual Score Score(int doc, string field_1_docID){return Score(doc, field_1_docID);}
public virtual IParseTree Evaluate(IParseTree tree){return Evaluate(tree.Root, null, null);}
public virtual string GetRuleSummary(){return this.ruleSummary;}
public virtual ServiceUpdates GetServiceUpdates(){return serviceUpdates;}
public string nameAt(int index){return names[index];}
public virtual IList<Location> GetLocations(){return locations;}
public virtual string GetLabel(){return GetLabelInternal();}
public virtual java.util.FileCache.Entry directoryCacheEntry(){return fileCacheEntry;}
public virtual void PutInt32s(long intCount, BytesRef src, int offset, int byteCount){Buffer.PutInt32s(intCount, src, offset, byteCount);}
public virtual void trim(){_limit = 0;}
public virtual interfaces_list(){return virtualInterfaceNames.getAllVirtualInterfaces();}
public override StemFilter Create(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,... arg12,... argN){return new RussianLightStemFilter(arg0, arg1, arg11, arg12, arg11, arg12, arg13, arg13, arg12, arg13, arg12, arg13, arg13, arg13, arg14, arg15, arg16, arg17, arg18, arg18, arg19, arg19, arg19, arg19, arg19, arg19, arg20, arg20, arg21, arg20, arg20, arg20, arg20, arg21, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg20, arg20, arg22, arg22, arg22, arg20, arg21, arg22, arg22, arg22
public virtual object Clone(){return (object)_array.Clone();}
public BasicSessionCredentials(string sessionName, string password){_sessionName = sessionName;_password = password;}
public override int ReadShorts(long count){int offset = _position + _positionalArray.Offset;for (int i = _position + _positionalArray.Offset; i < count; i++)_position += _positionalArray[i];return _positionalArray[i];}
public virtual void Activate(){this._enclosing.Activate(null);}
public virtual ReceiptRuleSet Details(){return Details;}
public FilterName(string name){this.name = name;}
public virtual void putDouble(double value){throw new System.NotImplementedException();}
public traffic policy { get; private set; }
public override void SetUp(int minIter){m_minIter = minIter;m_maxIter = maxIter;}
public override void write(int b){throw new System.NotImplementedException();}
public FileResolver(FileResolverConfig config){this.hostFileResolver = new FileResolverConfig(config);this.fileResolver = new FileResolver.FileResolver(config);}
public ValueEval CreateRef3DPxgEval(Ref3DPxgEval arg0){return CreateRef3DPxgEval(arg0, arg1);}
public void DeleteDataset(AT_Dataset dataset){Delete(dataset.GetPath(), dataset.IsRoot, null);}
public virtual void Start(){this.node = null;this.startAt = 0;this.endAt = null;this.isAlive = false;}
public virtual DescribeReservedCacheNodesOfferingResponse DescribeReservedCacheNodesOffering(DescribeReservedCacheNodesOfferingResponse result){return DescribeReservedCacheNodesOffering(result);}
public static int PMT(complex number){return PMT(number);}
public virtual ICollection<Version> GetVersions(string version){return Documents.GetVersions(version);}
public virtual IList<Destination> GetDestinations(){return new List<Destination> { this.GetDestination(null);}
public void DeleteAlias(string alias){_aliases[alias] = null;}
public virtual void grow(int count){for (int i = 0; i < count; i++){grow(count);}}
public string ToString(){return "N/A";}
public void CellDeleted(ICell cell){_cell = cell;}
public java.lang.String replaceAll(String m, string start, end) {for (int i = start; i < end; i++){m[i] = m[i];}}return m.ToString();}
public IdentityPoolConfiguration(IdentityPoolConfiguration identityPoolConfiguration){_identityPoolConfiguration = identityPoolConfiguration;}
public kth smallest value in a vector. Returns(k - 1) * m_element_size[0];}
public virtual void setValueAt(int index, V value){object[] newValues = new object[values.Length + 1];System.Array.Copy(values, 0, newValues, 0, values.Length);}
public virtual string ToString(IFormatProvider provider){return GetCanonicalName(provider);}
public virtual long CalculateTokenSizes(long start, long end){return CalculateTokenSizes(start, end);}
public virtual bool IsReadOnly(){return readonly;}
public void RemoveCell(Cell cell){_list.Remove(cell);_list.Clear();}
public virtual java.util.List<E> subList(){return list;}
public virtual string GetFileHeader(){return fileHeader;}
public virtual Attachments Attachments(IList<Attachments> operands){return _attachments(operands);}
public virtual InitiateJobRequest Create(InitiateJobRequest request){var options = new InvokeOptions();options.RequestMarshaller = InitiateJobRequestMarshaller.Instance;options.ResponseUnmarshaller = InitiateJobRequestUnmarshaller.Instance;return Invoke<InitiateJobRequest>(request, options);}
public virtual string ToString(){return GetCanonicalName();}
public virtual void Set(string @name, string @value){m_name = @name;m_value = @value;}
public virtual void Add(string field){m_index.Add(field);}
public virtual void Delete(){_stackSet = null;}
public virtual BuildRuleList GetBuildRuleList(RepositoryInfo repo){return buildRuleList;}
public new _SPARSE_ARRAY_START(n, elements, offset, length) { this.elements = new _SPARSE_ARRAY_START(n, elements, offset, length);}
public InvokeServiceRequest(): base("/invokeservice", "2017-03-21", "InvokeService"){return Invoke<InvokeServiceRequest>(this, InvokeOptions.RequireServiceBus, InvokeOptions.UseQueryString, InvokeOptions.UseQueryStringValues, InvokeOptions);}
public virtual IList<Photo> GetAlbumPhotos(){return GetAlbumPhotos(null, null, null);}
public virtual bool hasPrevious(){return this._enclosing.hasPrevious();}
public void DeleteConfiguration(Configuration config){DeleteConfiguration( config.ConfigurationDirectory, config.Name, config.IsExternal, null);}
public virtual CreateLoadBalancerRequestResponse CreateLoadBalancerRequest(string loadBalancerName){var request = new InvokeOptions();request.LoadBalancerName = loadBalancerName;request.SetCreateBalancerCallable(createLoadBalancerCallable);return Invoke<CreateLoadBalancerRequestResponse>(request, null, null);}
public virtual UserInfo GetUserInfo(){return userInfo;}
public virtual TagCreateOrUpdateResponse TagCreateOrUpdate(TagCreateOrUpdateResponse t){return TagCreateOrUpdate(t, "tagCreateOrUpdate")}
public virtual string GetRefName(){return @string.Empty;}
public string Build(IQueryPart query, string field_1, string field_2, int field_3, int field_4, int field_5, int field_6, int field_7_options){return query + " AND " + field_5 + " = " + field_6_options.ToString(CultureInfo.InvariantCulture) + " " + field_7_options.ToString(CultureInfo.InvariantCulture);}
public bool subTotal(int row, int column){return row*column == 0;}
public virtual DBProxiesInformation GetProxiesInformation(){return proxies;}
public VoiceConnector Proxy (ProxyConnector proxy){return voiceConnectorProxy;}
public WindowCacheConfig(Config config){this.config = config;}
public override DateTime Value(double value){return Current.GetDate(value);}
public virtual void Start ( ){StartGuardDuty(true, true);}
public override long size(){return this._enclosing._size;}
public virtual RouteDetail RouteDetail(RouteDetail routeDetail){return RouteDetail(routeDetail.RouteInfo);}
public virtual void DeleteCluster(){Cluster c = (Cluster)GetCluster();c.Delete();}
public virtual string GetDescription(){return GetErrorString();}
public FileBasedConfig Create(FileConfig config){return new FileBasedConfig{DirectoryConfig = config, };}
public virtual void MoveToNextSentenceFollowing(int position){MoveToNextSentence(position);}
public virtual void UpdateParameterGroup(string name, string value){if (name == null){throw new ArgumentNullException("name cannot be null");}m_parameters = new string[value.Length + 1];}
public virtual NGit.Storage.File.Record GetRecord(){return this._enclosing.GetRecord(this.name);}
public virtual float GetErrorPercent(){return Error.GetErrorPercent() * Error.GetShapeErrorValue();}
public virtual int codePointAt(int index){return codePointAt(index);}
public void SetPasswordVerifier(String passwordVerifier){this.passwordVerifier = passwordVerifier;}
public virtual List<VaultReference> GetVaults(){return vaults;}
public DateTimeFormatter dateFormatter = null {}
public GetVideoCoverRequest(VideoCoverRequest request){var options = new InvokeOptions();options.RequestMarshaller = GetVideoCoverRequestMarshaller.Instance;options.ResponseUnmarshaller = GetVideoCoverRequestUnmarshaller.Instance;return Invoke<GetVideoCoverRequest>(request, options);}
public virtual int indexOf(object o){if (this.contains(o)){return this.indexOf(o);}return -1;}
public virtual Spot FleetResponse SpotFleetGet(string path, string pathType){return Spot FleetGet(path, pathType);}
public void IndexFaces(IList<Face> faces){if (faces == null){faces = new ArrayList<IFace>();}else{faces.Sort((Face[])faces);}}
public virtual java.util.BreakIterator getBreakIterator(CScript script){return _breakIterator;}
public virtual string ToString(){return GetType().FullName;}
public virtual int GetOpenFilesCount(){return _git.NumOpenFiles();}
public string GetFeatureHeaderID(){return hdrId.ToString();}
public override object ToUnicodeLE(String s){return _string2le(s);}
public IList<string> GetFooterLines(string key){return GetFooterLines(null, key);}
public virtual void refresh(E e){throw new System.NotImplementedException();}
public override float get(int index){return base.get(index);}
public void DeleteGuardDutyDetector(DeleteGuardDutyDetectorRequest request){var options = new InvokeOptions();options.RequestMarshaller = DeleteGuardDutyDetectorRequestMarshaller.Instance;options.ResponseUnmarshaller = DeleteGuardDutyDetectorResponseUnmarshaller.Instance;return;}
public virtual void Grow(int count){Buffer.BlockCopy(m_array, 0, m_array.Length * index.Row, m_array.Length * index.Column, count);}
public virtual IList<Exclusion> GetExclusions(){return exclusions;}
public override SpatialStrategy GetSpatialStrategy(int round){return SpatialStrategy.Get(round);}
public void RestoreClusterData(ClusterData clusterData){RestoreClusterInternal(clusterData, 0, 0);}
public override void Serialize(ILittleEndianOutput out1){out1.WriteShort(field_1_error_code);}
public AgentProfile CreateOrUpdate(string profileName){return AgentProfile.CreateOrUpdate(profileName, true);}
public virtual ParseTreePattern Compile(ParserRuleContext ctx){return Compile(ctx.Parent, ctx.PatternBlock);}
public virtual BacktrackingBatchBacktracking Create(int maxNum, int maxDoc){return backingArray.Create(maxNum, maxDoc);}
public override string ToString(){return strategy.ToString();}
public virtual void CopyTo(byte[] array){System.Array.Copy(contents, 0, array, 0, contents.Length);}
public virtual LineMap CreateLineMap(byte[] array){return CreateLineMap(array, 0, array.Length);}
public virtual HashSet<HollowObjectWriteHandle> emptySets(){return emptyHaves(new HashSet<HollowObjectWriteHandle>());}
public override long TotalBytesUsed(){return base.TotalBytesUsed();}
public override String ToString(){StringBuilder sb = new StringBuilder(64);sb.Append(GetType().Name).Append("[ESCHER]\n");sb.Append("default-interaction=").Append(IsDefaultInteraction).Append(";").Append(IsDefaultInteraction).Append(";").Append(IsDefaultInteraction).Append(";").Append(IsDefaultInteraction).Append(";").Append(IsDefaultInteraction).Append(";").Append(IsDefaultInteraction).Append(")").Append(IsDefaultInteraction).Append(")").Append(IsDefaultInteraction).Append(")").Append(IsDefaultInteraction).Append("]").Append(IsDefaultInteraction).Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction).Append(")").Append(IsDefaultInteraction.Append(")").Append(IsDefaultInteraction.Append(IsDefault).Append(IsDefault).Append(")").Append(Is
public GalicianMinimalStemFilter(){return new GalicianMinimalStemFilter(this);}
public virtual string ToString(){return GetCanonicalName();}
public override void AddParameters(){addParameter(0, "include");addParameter(0, "exclude");}
public OptionGroup(OptionGroup option){this.option = option;}
public virtual void AssociateMemberAccount(MemberAccount account){this.memberAccount = account;}
public virtual void Run(BaseRefreshProgressTask task){Run(task);}
public virtual void SetTerminationProtection(int protection){terminationProtection = protection;}
public override string GetErrorHeader(string text){return GetErrorHeader(text, true);}
public override java.nio.CharBuffer get(){return _buf;}
public virtual void StopSentimentDetectionJob(){return;}
public virtual IDictionary<object, object> GetIDs(){return new Dictionary<object, object>();}
public virtual void Clear(){hash = null;}
public void reset(){current.position = 0;}
public override int ReadRefErrorPtg(int input){int r = _rc4.Xorint32(_input, _rc4.Yorint32_ctx);return _rc4.Xorint32_ctx._in.ReadRefErrorPtg(input);}
public virtual void SuspendGameServerGroup(string groupName){SuspendGameServerGroup(groupName);}
public ValueEval GetExpressionAt(int sourceRow, int sourceColumn){return GetExpressionAt(sourceRow, sourceColumn);}
public virtual GetRepoRequest SetRepoRequestParameters(){return request.SetResourceParameters();}
public DateTime set_date{get_date = date;}
public GermanMinimalStemFilter(){return new GermanMinimalStemFilter(this);}
public virtual object Clone(){return (object)Clone(this.elements[0]);}
public void write(char b){write(b, 0, b.Length);}
public override RevFilter WithDocumentAfter(DateTime date){return WithDocumentAfter(date);}
public void DeleteGroupPolicy(string groupName, string policyName){_groupName = groupName;_policyName = policyName;}
public virtual void DeregisterMulticastGroup(MulticastGroup group){DeregisterMulticastGroup(group.MulticastGroupNumber);}
public virtual void DeleteScheduledActions(){_actions = new ScheduledActions(null, _batchSize, _batchFileDeleter, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _logDeleteScheduledActions, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDeleterGroup, _logDeleteScheduledActions, _batchFileDeleterGroup, _batchFileDeleterGroup, _batchFileDelete, _batchFileDelete, _batchFileDelete, _batchFileDeleteLine, _batchFileDeleteLine
public virtual StemmerOverrideMap Create(String algorithmName, byte[] data): base(algorithmName, data){Add(algorithmName, data);}
public override byte ReadByte(){return delegate1.ReadByte();}
public virtual void setLength(int length_1){buffer.length = length_1;}
public virtual DescribeScalingProcessesTypeResponse DescribeScalingProcessesType(DescribeScalingProcessesTypeRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeScalingProcessesTypeRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeScalingProcessesTypeResponseUnmarshaller.Instance;return Invoke<DescribeScalingProcessesTypeResponse>(request, options);}
public List<ResourceRecordSet> Get(int recordSetNumber){return list(0, recordSetNumber, null);}
public virtual IToken Recovers(IToken tok){MoveNext();}
public virtual void SetTags(string tags){_tags = tags;}
public ModifyStrategyRequest(string strategyName){return new ModifyStrategyRequest(strategyName, null, null);}
public virtual DescribeEndpointServicesResponse DescribeEndpointServices(DescribeEndpointServicesRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeEndpointServicesRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeEndpointServicesResponseUnmarshaller.Instance;return Invoke<DescribeEndpointServicesResponse>(request, options);}
public virtual void Init ( ){base.Init();}
public virtual bool contains(object o){return map.containsKey(o);}
public SheetRangeName(String rangeName){_rangeName = rangeName;}
public string GetDomainName(){return domainName;}
public virtual ParseException NewParseException(string message, int start, int end){return ParseException(message, start, end);}
public FetchPhotos request(object, string, int, string, bool, string, GnuPGProtocolMarshaller) : base(defaultParams){HTTPS = true;}
public override java.io.Writer getWriter(){return new java.io.PrintWriter(this);}
public NGramTokenizer(int argc, int argh, char[] argp, int argc, int argc, int argd, int argc, int argd, int argc, int argd, int argc, int argd, int argc, int argd, int argc, int argd, int argc, int argd, chard, intd, intd, intd, intd, intd, intd, intd, intd, intd, intd, intd, intd, intd, intd, intd, intd, chard, chard, intd, intd, chard, intd, intd, intd, chard, intd, intd, chard, intd, chard, intd, intd, chard, intd, intd, intd, intd, intd, intd, intd, intd,intd,intd,intd,intd,intd,intd,intd,intd,intd,intd,d,d,d,d,d,d,d,e,e,e
public override bool IsDirectory(){return false;}
public override bool StemDerivational(int doc){this.m_doc = doc;this.m_compiled = new CompiledSource(this, parser, 0, doc.Length);this.m_compiled_flag = true;this.m_compiled_flag2 = true;this.m_compiled_flag3 = new CompiledSource(this, parser, 0, doc.Length);}
public traffic policy { get; private set; }
public override void Serialize(ILittleEndianOutput out1){out1.Write(this.password.Serialize(out1));}
public virtual int Floor(int n){return Math.Floor(n, m_nRounding) ;}
public void Reset(byte[] b){Reset(b, 0, b.Length);}
public virtual IList<ITree> GetChildren(ITree tree){return GetChildrenInternal(tree, null);}
public virtual void Clear(){table.Clear();}
public void RefreshAll() {RefreshAllInternal(false);}
public virtual DeleteNamedQueryResponse DeleteNamedQuery(DeleteNamedQueryRequest request){var options = new InvokeOptions();options.RequestMarshaller = DeleteNamedQueryRequestMarshaller.Instance;options.ResponseUnmarshaller = DeleteNamedQueryResponseUnmarshaller.Instance;return Invoke<DeleteNamedQueryResponse>(request, options);}
public GraphvizFormatter(Connection costs){return new GraphvizFormatter(costs);}
public CheckMultiagentRequest(string multiagentId){_multiagentId = multiagentId;}
public virtual UserProfile[] GetUserProfiles(){return UserProfile.objects.Values;}
public virtual NGit.Relations.Relation CreateFromSnapshot(Snapshot snapshot){return CreateFromSnapshot(snapshot.CreateDatabase());}
public virtual void Start(){this.phase = EnvironmentTransition.Starting;this.m_execution = null;}
public virtual IgnoringSet<string> GetIgnoredPaths(){return _ignoredPaths;}
public override void Read(int stream, OutputStream outputStream){_is = stream;}
public void SetChangeAction(ChangeAction action){this.changeAction = action;this.resourceRecordSet = new ResourceRecordSet(this);}
public void DeleteImage(File file){Delete(file.FullName, file.GetFile());}
public CompositeReaderContext CreateConfigurationSet(XmlReader reader){return CreateConfigurationSet(reader);}
public virtual java.util.Iterator<E> elements(){lock (this._enclosing){return _enclosing.elements();}}
public void VisitAllContainedRecords(Record[] containedRecords){VisitAllContainedRecords(containedRecords);}
public override string ToString(){return FtCbls.ToString(this);}
public BATBlock Create(EofType){return Create(default(BATBlock), 0);}
public virtual UpdateResourceResponse UpdateResource(UpdateResourceRequest request){var options = new InvokeOptions();options.RequestMarshaller = UpdateResourceRequestMarshaller.Instance;options.ResponseUnmarshaller = UpdateResourceResponseUnmarshaller.Instance;return Invoke<UpdateResourceResponse>(request, options);}
public virtual void DeleteMailboxPermissions(string mailbox){DeleteMailboxPermissions(mailbox, 0, mailbox.Length);}
public virtual IList<DatasetGroup> GetDatasetGroups(){return datasetGroups;}
public virtual void Resume(){Sharpen.Extensions.Resume(this, e) ;}
public virtual DescribeGuardDutyAccountResponse DescribeGuardDutyAccount(DescribeGuardDutyAccountRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeGuardDutyAccountRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeGuardDutyAccountResponseUnmarshaller.Instance;return Invoke<DescribeGuardDutyAccountResponse>(request, options);}
public String ToString(){return HSSFErrorConstants.GetText(hssFgId);}
public virtual MergeObjectsResponse MergeObjects(MergeObjectsResponse mergeObjects){return MergeObjects(mergeObjects.Values);}
public virtual string ToDo(){return GetHashCode().ToString();}
public XPathContext Create(XmlParserParser parser, string path){return Create(parser, path, XPathOptions.DefaultInstance);}
public CreateAccountAliasRequest(AccountAliasRequest request){var options = new InvokeOptions();options.RequestMarshaller = CreateAccountAliasRequestMarshaller.Instance;options.ResponseUnmarshaller = CreateAccountAliasRequestUnmarshaller.Instance;return Invoke<CreateAccountAliasRequest>(request, options);}
public override void Decode(int n){Decode(n, m_buf, _stndStart, _stndLength);}
public virtual NGit.Api.PushConnection Open(string host, int port){return Open(host, port, "push", "open");}
public virtual void CopyCharsTo(TextReader src, TextWriter dst, int index){Debug.Assert(src!= dst);}
public virtual string key(V value){return map.get(key, value);}
public virtual int count(void) {foreach (E e in array[offset + _position]){return e.length;}}
public virtual void add(E e){throw new System.NotImplementedException();}
public virtual GetDomainDomainResponse GetDomainDomain(GetDomainDomainRequest request){var options = new InvokeOptions();options.RequestMarshaller = GetDomainDomainRequestMarshaller.Instance;options.ResponseUnmarshaller = GetDomainResponseUnmarshaller.Instance;return Invoke<GetDomainDomainResponse>(request, options);}
public void flush(){_writer.flush();}
public override CharFilter Create(int capacity, int capacityLimit, CharFilter other){return new PersianCharFilter(this, capacity, other);}
public virtual void IncrementToken(IToken token){IncrementToken(token);}
public java.nio.FloatBuffer allocate(int capacity_1){return allocation_1(capacity_1);}
public virtual NGit.Diff.Edit GetCopyAfter(ObjectEdit other){return other.GetCopyAfter(this);}
public virtual RuleVersion Update(RuleVersion rule){return rule;}
public virtual List<TerminationCredential> GetTerminationCredentials(){return list("available");}
public virtual DescribeDeploymentTargetResponse DescribeDeploymentTarget(DescribeDeploymentTargetRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeDeploymentTargetRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeDeploymentTargetResponseUnmarshaller.Instance;return Invoke<DescribeDeploymentTargetResponse>(request, options);}
public virtual void SetNoChildReport(INoChildReport other){m_noChildReport = other;}
public override E get(E location){return location.get(E);}
public virtual DataSet GetDataSet(){return dataSet;}
public int value { set = true;return _treeIndex;}
public virtual void DescribeNetworkInterfaces(){DescribeNetworkInterfaces0(null);}
public bool contains(object o){return this._enclosing.containsKey(o);}
public virtual string ToString(){return ToString(null);}
public virtual PatchType Get(int id){return type;}
public IEnumerator<K> KeysInMap(K key){return outerInstance.GetKeysInMap(key);}
public virtual NGit.Api.Script CreateScript(){return (null);}
public BytesRef Next(){return _buf.Next();}
public virtual string GetOutputAsString(){return GetErrorOutputAsString();}
public void SetApplicationName(string appName, string applicationName) {this.applicationName = appName;this.applicationName = applicationName;}
public virtual void Unpop(ICommit @commit){_list.Remove(@commit);}
public EdgeNGramTokenizer(){return new EdgeNGramTokenizerAnonymousInnerClassHelper(this);}
public virtual void ModifyParams(int argc, DBParameter group, string newValue, int existingValue, int... otherValues){m_params = newValue;m_newValue = newValue;}
public virtual int limit(int hostedZoneId){return _limitForHostedZoneId;}
public virtual void setValueAt(int index, V value){object[] newValues = new object[values.Length + 1];System.Array.Copy(values, 0, newValues, 0, values.Length);}
public override TreeFilter Clone(){return this;}
public virtual string ToString(){return "Unknown";}
public virtual bool CanAppendHeads(){return true;}
public virtual int lastIndexOf(string str){return lastIndexOf(str, 0, str.Length - str.Length);}
public virtual void DeleteNetworkACLEntry(int networkACLIndex){if (networkACLIndex < 0){throw new ArgumentOutOfRangeException("network ACL index " + networkACLIndex);}list.Remove(networkACLIndex);}
public virtual void AddMember(T member){Members.Add(member);}
public int GetFirstCommitterCharacter(sbyte[] b){return (b[f].Index & 0x00FF);}
public virtual int GetLine(){return line;}
public virtual void AddSubmodulePath(string path){submodules.AddItem(path);}
public virtual PushTemplate GetPushTemplate(int id){return push_templates.Get(id);}
public virtual GetVaultResponse GetVault(GetVaultRequest request){var options = new InvokeOptions();options.RequestMarshaller = GetVaultRequestMarshaller.Instance;options.ResponseUnmarshaller = GetVaultResponseUnmarshaller.Instance;return Invoke<GetVaultResponse>(request, options);}
public virtual DescribeVpcPeeringConnectionsResponse DescribeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeVpcPeeringConnectionsRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeVpcPeeringConnectionsResponseUnmarshaller.Instance;return Invoke<DescribeVpcPeeringConnectionsResponse>(request, options);}
public override void put(long value){if (value >= 0){throw new System.IndexOutOfRangeException("value=" + value + " outOfBounds=" + (long)value.ToString("broken-out"));}else{buffer[offset + writeIndex++] = value;}}
public virtual void Register(Object o){if (o == null){throw new ArgumentNullException("o");}this.o = o;}
public NGit.Diff.Format GetFormat(int id){return formats[id];}
public virtual void Delete(DeleteAppRequest request){var options = new InvokeOptions();options.RequestMarshaller = DeleteAppRequestMarshaller.Instance;options.ResponseUnmarshaller = DeleteAppResponseUnmarshaller.Instance;return;}
public virtual ChannelDetail GetChannelDetail(){return channelDetail;}
public override void Close(){this._enclosing.Close();}
public bool IsSchemeChar(int index){return 0 <= index && (_scheme[index]) >= 0;}
public virtual IList<string> GetAppliedSchemas(){return Sharpen.Collections.UnmodifiableList(_appliedSchemas);}
public string GetName(){return user.GetName();}
public virtual SQRTValue Evaluate(ITokenToken token, IList<SQRTValue> tokens){return Eval(token, tokens);}
public virtual bool equals(object[] array, int position){return indexOf(array, position);}
public void RemoveName(int index){names.RemoveAt(index);}
public QueueUrlAttribute(string queueUrl){_queueUrl = queueUrl;_attributeNames = attributeNames;}
public virtual bool[] bools(){return bools();}
public virtual void SetEnabled(bool value){this.value = value;}
public virtual void Delete(string logPattern){if (string.IsNullOrEmpty(logPattern)){throw new ArgumentNullException("logPattern")}if (string.IsNullOrEmpty(logPattern)){throw new ArgumentNullException("pattern");}string existingPattern = logPattern.Split(":.[/]".ToCharArray(new PatternMatch(pattern));string pattern2 = logPattern.Skip(logPattern.Length);string oldPattern = logPattern.Split(new PatternMatch(pattern2)).Last();string pattern3 = string.Empty;if (oldPattern!= null) {logPattern.Split(new PatternMatch(oldPattern, new PatternMatch(pattern2, true)).TrimEnd();}if (existingPattern!= null) {logPattern.Delete(existingPattern.ToString(), StringComparison.Ordinal)).Append(newPattern).Append(':').Append(pattern2).Append(newPattern).Append(newPattern).Append(':').Append(Pattern2).Append(Pattern3).Append(Pattern3).Append(Pattern3).Append(Pattern3).Append(Pattern3).Append(Pattern3).Append(Pattern3).Append(Pattern3).Append(Pattern2).Append(
public bool Contains(object o){return map.ContainsKey(o);}
public Sheet IndexOf(int index){return _externs[index];}
public virtual bool IsValidCommandLine(string cmd){return GetCommandLine(cmd, false);}
public virtual MergeStrategiesRegister(MergeStrategiesRegister strategy){strategies.Register(strategy);return this;}
public override long Length(){return _size;}
public virtual void SetHostedZoneId(string zoneId){_zoneId = zoneId;}
public virtual DescribeGuardDutyFindingsResponse DescribeGuardDutyFindings(){return DescribeGuardDutyFindingsResponse(GetGuardDutyFindingsRequest());}
public virtual GetTopicsDetectionJobResponse GetTopicsDetectionJob(GetTopicsDetectionJobRequest request){var options = new InvokeOptions();options.RequestMarshaller = GetTopicsDetectionJobRequestMarshaller.Instance;options.ResponseUnmarshaller = GetTopicsDetectionJobResponseUnmarshaller.Instance;return Invoke<GetTopicsDetectionJobResponse>(request, options);}
public virtual Match ProcessMatch(Match match){return new Match(this, match);}
public override void Write(ILittleEndianOutput out1){out1.WriteShort(field_1_reserved);}
public Main(){InitializeInstanceFields();}
public override bool GetValue(){return field_1_value;}
public CacheInitializer(int seed){_default = seed;}
public virtual void SetCacheSource(CacheSource source){this.cacheSource = source;}
public AttributeDefinition(string name, int type){_name = name;_type = type;}
public virtual string join(ICollection<string> collection, string separator){lock (mutex){return c.join(collection.values(), separator);}}
public virtual IList<TaskDefinitionFamily> GetTaskDefinitionFamilies(){return taskDefinitionFamilies;}
public IList<Component> GetComponents(){return Sharpen.Collections.UnmodifiableList(GetComponents()));}
public virtual ActivatePhotoRequest ActivatePhotoRequest(string photoId){return photoId == null? ActivatePhotoRequest() : ActivatePhotoRequest(photoId);}
public matchset_t rule_set(string name, List<string> args){return new _MatchSet_trule_set(name, args);}
public virtual IList<CIDRAddressRange> GetAvailableCidrBlock(){return _ipv4.listAvailableCidrBlock() { _ipv4.listAvailableCidrBlock() };}
public virtual IDictionary<object, object> GetBaseObjectIDs(){return baseObjectIDs;}
public virtual void DeletePushTemplate(int push_template_id){DeleteInternal(push_template_id, 0);}
public DomainEntry(String domainName, String password){return domainEntries[domainName] = password;}
public override int size(){return _size;}
public OpenNLPTokenizerFactory(){return new OpenNLPTokenizerFactory(this);}
public int valueAt(int index){return elements[index];}
public virtual IList<HeadObject> GetHeadObjects(char c){if (c == 0){return list.EmptyList<HeadObject>();}return list.EmptyList<HeadObject>();}
public override void putShort(short value){throw new System.NotImplementedException();}
public override void write(object o){if ((o!= null) && ((o.GetWriteHandle() == null)){out1.write(o);}else{out1.write(o);}}
public virtual int codePointToOffset(int codePoint){return string.GetCodePointToOffset(codePoint);}
public virtual string GetUniqueAlt(IDictionary<string, IAltSet> altsets){return GetUniqueAlt(altsets, true);}
public virtual DateTime GetWhen(){return when;}
public void SetRuleName(string ruleName){this.ruleName = ruleName;this.bypassTokenType = GetTokenName(tokenName);this.label = GetTokenName(tokenName);}
public virtual void DisableOrganizationAdminAccount(string orgName){string orgName = GetOrganizationName(orgName);bool off = false;try{OnOrganizationAdminAccount(orgName, off);}catch (NameNotFoundException){if (off == false){return;}}Off = true;}
public Room(Props props){this.props = props;}
public virtual void DeleteReplicationGroup(ReplicationGroup group){DeleteReplicationGroup(group.ReplicationGroupName);}
public override java.nio.CharBuffer decode(byte[] buffer, int length){return decode(buffer, 0, length);}
public virtual void SetIdStatus(int idStatus){_idStatus = idStatus;_domainName = name.Name;}
public virtual double[] GetValues(int index){return values;}
public void ReadDateWindow1904(Record record){_is1904 = true;_is203 = false;_is266 = false;}
public virtual void SetDeleteId(int id){this.id = id;}
public override Object Get(string key){return this._enclosing.Get(key);}
public chunkerModelLoaded(chunkerModel) {return chunkerModel;}
public virtual void Complete(){base.Complete();}
public virtual Hashtable Clone(){return new Hashtable(this._enclosing);}
public override long Length(){return this._enclosing._size;}
public void Register(Amazon.EC2.LoadBalancer2Instance2 instance2){Register(instance2, null);}
public virtual DescribeClusterUserKubeconfigRequest(): base( DescribeClusterUserKubeconfigRequest){return DescribeClusterUserKubeconfig(new DescribeClusterUserKubeconfigOptions());}
public int ReadPrecision(RecordInput in1){return _in1.ReadInt();}
public override void Serialize(Stream stream){throw new System.NotImplementedException();}
public virtual void Delete(VirtualInterface interface){Delete(interface.WireName);}
public Entry Get(string name){return (Entry)GetEntry(name);}
public string GetText(IVocabulary vocabulary){return vocabulary.ToString(null, NumberStyles.Integer, vocabulary);}
public virtual void DeleteOrigination(Amazon.GuardDuty.VoiceConnector other){Delete(other.AmazonGuardDutyVoiceConnector);}
public virtual void append(char c){append0(c);}
public virtual Generation GetGeneration(){return generation;}
public virtual TagOption GetTagOption(string option){return tagOptions[option];}
public virtual void StartContentModeration(){m_start = GetUniqueWordPtr(GetDoc(), 0);m_end = GetUniqueWordPtr(GetDoc(), 0);}
public virtual string quote(string str){return quote(str, CultureInfo.InvariantCulture);}
public void setValue(T value){throw new System.NotImplementedException();}
public virtual void SetInputStream(java.io.InputStream @is){throw new System.NotImplementedException();}
public override float GetValue(){return base.GetValue();}
public override int copy(){return byteBuffer.copyTo(byteArray, offset, this.length);}
public virtual void ClearErrorListeners(){ErrorListener[] e = errors;for (int i = 0; i < e.listeners.Length; i++){e.Remove(i);}}
public StreamTokenStreamStream(TokenSource tokenSource, int channel){return new StreamTokenStream(tokenSource, channel);}
public virtual PolicyCollection PolicyObjects{get; private set; }
public virtual PackType SetType(PackType type){this.type = type;}
public virtual Stemmer GetStem(string str){return StemmerUtil.Stem(str, m_luceneMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_luceneMatchVersion, m_matchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_bogusMatchVersion, m_matchGroups, m_matchGroups, m_matchGroups, m_matchGroupsToMatchGroups, m
public virtual void Error(ITokenStreamException tsn){throw new InvalidOperationException("Unexpected token stream exception");}
public String ToString(){StringBuilder sb = new StringBuilder(64);sb.Append(field_3_string.Utf8ToString());sb.Append(", ").Append(field_3_string.Utf8ToString());sb.Append(")");return sb.ToString();}
public UnlinkFaceRequest(): base(){return new UnlinkFaceRequest(defaultParameters);}
public virtual void Set(string value){this.value = value;}
public string Get(string key){return Sharpen.StringHelper.Get(this.enclosing, key, CultureInfo.InvariantCulture);}
public virtual IList<string> GetSecurityGroupsForMountTarget(){return targetSecurityGroups;}
public virtual DescribeAPIMappingResponse DescribeAPIMapping(DescribeAPIMappingRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeAPIMappingRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeAPIMappingResponseUnmarshaller.Instance;return Invoke<DescribeAPIMappingResponse>(request, options);}
public string URL { get; set; }
public int SubExpressionCount(int SubExpressionCount){return(SubExpressionCount)field_1_begin.SubExpressionCount;}
public override int Get(int field){return 0;}
public void DeleteChannel(int channel){DeleteInternal(channel, 0);}
public override IList<FaceData> GetFaces(){return faces;}
public virtual EscapingSourceDefinition source { get; private set; }
public virtual char get(int index){lock (@lock){return buf[index];}}
public virtual UpdateConfigurationProfileResponse UpdateConfigurationProfile(UpdateConfigurationProfileResponse result){return UpdateConfigurationProfile(result.ConfigurationProfileRecord);}
public virtual IList<LifecycleHook> GetLifecycleHooks(){return lifecycleHooks;}
public virtual IList<Reservation> GetHostReservations(){return hostReservations;}
public PredictionContext CreatePredictionContext(RuleContext context){return PredictionContext.Create(context.RuleContext, context.EvaluationContext);}
public virtual string GetDescription(){return GetDescription() ;}
public override string ToString(){return this.GetType().Name + " " + this.GetResult().GetHashCode();}
public virtual DiffSet[] GetChangeSets(){return changeSets;}
public virtual bool AllowNonFastForwards(){return true;}
public FeatRecord Create(Record record){return Create(record, null, null);}
public void PutShort(short value){int newPosition = _position + 2;_position = newPosition;}
public QuerySetQuery(string query){this.m_query = query;}
public virtual NGit.Api.StashApplyCommand CreateStashApplyCommand(string stashName){return new NGit.Api.StashApplyCommand(stashName, true);}
public ICollection<string> GetNames(){return dictionaryNameToID.Keys;}
public int getEffectivePort(string scheme, int port){return effectivePorts[scheme];}
public virtual IList<AssessmentTemplate> GetAssessmentTemplates(){return new List<AssessmentTemplate> { this.assessmentTemplate}
public virtual void RestoreClusterFromSnapshot(Cluster snapshot){this._enclosing.RestoreCluster(snapshot);}
public void AddShape(IShape shape){shapes.Add(shape);}
public override bool Equals(object o){if (o == this){return true;}return false;}
public int indexOf(char c){if (index == -1){return -1;}return indexOf(c, 0, c - 0);}
public virtual bool IsDelta(){return this.GetType().IsAtomic();}
public virtual void EmitEOF(IToken t){EmitToken(t.Key, TokenConstants.EOF);}
public virtual void SetUserName(string user_name){user_name = user_name;}
public virtual Filter GetNotPresentFilter(){return GetNotPresentFilter();}
public virtual void SetTagger(GramBaseTagger tagger){this.tagger = tagger;}
public override java.nio.BufferSize bufferSize(){return _bufSize;}
public virtual void trimEnd(){string str = string.Empty;m_start = str.TrimEnd();m_end = str.TrimEnd();}
public void ReadTopMarginRecord(Record record){_rc4.SkipTwoBytes();_rc4.WriteRecord(topMarginRecord);}
public virtual EnvironmentInfoResponse EnvironmentInfo(EnvironmentInfoRequest request){return EnvironmentInfo(request);}
public SessionsGroup: CreateOrUpdate<SessionsGroup>(){return SessionsGroup{CreateOrUpdate<SessionsGroup>(this);}
public ProxySession(HttpSessionConfig config){return session;}
public virtual string GetType(){return _type;}
public string getScheme(){return scheme;}
public virtual void append(char ch){chars.append(ch);}
public FetchAlbumTagPhotosRequest(): base(){return new FetchAlbumTagPhotosRequest(null, null, null);}
public virtual void DeleteMembers(List<Member> members){foreach (Member member in members){Delete(member.GetMember());}}
public virtual GetReachabilityResponse GetReachability(GetContactAttributesRequest request){var options = new InvokeOptions();options.RequestMarshaller = GetContactAttributesRequestMarshaller.Instance;options.ResponseUnmarshaller = GetReachabilityResponseUnmarshaller.Instance;return Invoke<GetReachabilityResponse>(request, options);}
public virtual void remove(object o){lock (this._enclosing){object[] s = this._enclosing._size;this._enclosing.remove(o);}}
public virtual E last(E e){return last(e.key, e.value);}
public virtual StreamingDistribution Create(StreamingDistribution distribution){return distribution;}
public bool isAbsolute(){return path.isAbsolute();}
public virtual void DisableAddOn(EscherAddOn dispense){_addOn = dispense;}
public virtual Alias GetAlias(){return _aliases[_lucene_start_index];}
public virtual void Next();{Next = this.Peek();}}
public override TreeFilter Clone(){return this;}
public override TextReader Create(TextReader input){return new PersianCharFilter(this, input);}
public string value { get; set; }
public virtual string ListAsString(){return Sharpen.Collections.ToString(this._enclosing);}
public virtual SignalingChannel Information(string channel){return information;}
public static IP Attach(string appName, string ip) {return staticIP;}
public override string ToString(){return "ref(" + @ref +")cmd(" + cmd + ")cnt(" + cnt + ")skp(" + skip + ")";}
public BloomFilteringPostingsFormat(){return (BloomFilteringPostingsFormat)((BloomFilteringPostingsFormat)this).field_1_postings_format;}
public virtual IList<Template> GetTemplates(){return Sharpen.Collections.UnmodifiableList(templates).Values;}
public TimerThread(Resolution resolution, Counters parameters){return new TimerThread(resolution, counters);}
public void Reset(Graphics2D context){_ctx = new Graphics2D.Context(context, 0);_ctx.Clear();_paintRecord = null;}
public virtual IList<DirectoryInfo> GetDirectories(){return new List<DirectoryInfo> { GetDirectoryInfo(root) };}
public virtual byte[] Decode(byte[] bytes, int offset, int length){for (int i = offset; i < length; i++){byte b = Decode(bytes[i], 16);if (b!= null){int b1 = Decode(bytes, i + offset, length);int b2 = Decode(bytes, i + offset, length);int b3 = Decode(bytes, i + offset, length);for (int i = i + length; i < b3; i++){b3 = Decode(bytes, i + offset, length);}}return b3;}
public virtual void Dispose(){this._enclosing.Dispose();}
public override int idealSize(byte[] b){return this._enclosing._size;}
public virtual UpdateAssessmentTargetResponse UpdateAssessmentTarget(UpdateAssessmentTargetResponse result){return UpdateAssessmentTarget(result.AssessmentTarget, result.TargetedAssessmentTarget);}
public virtual void ModifyVolume(File file){this.File = file;this.Mode = FileMode.Modify;}
public void MergeCells(Cells cells){MergeCells(cells.First, cells.Last);}
public override long Read(long length){return delegate1.Read(length);}
public virtual void ActivityTaskCompleted(ActivityTask task){_activityTaskCompleted = task;}
public virtual void IncrementProgress(int amount){IncrementedProgress += amount;}
public override bool IsFull(){return false;}
public override NumberRecord Convert(Record rec){return rec.Value;}
public virtual void putCharAt(int index, char c){array.putCharAt(index, c);}
public virtual int GetRowCount(){return rowCount;}
public override BeiderMorseFilterFactory Create(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int if16, arg18, bool arg18, arg18, arg18, arg19, arg19, arg20, arg21, arg22, arg20, arg21, arg22, arg20, arg20, arg21, arg22, arg22, arg22, arg20, arg20, arg12, arg18, arg18, arg19, arg19, arg20, arg20, arg20, arg20, arg20, arg20, arg21, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22, arg22,
public virtual float variance(int x){return m_v1.var(x);}
public override PersianNormalizationFilterFactory Create(NormalizationFilterParameters parameters){return Create(parameters, new PersianNormalizationFilterFactory(m_luceneMatchVersion, m_luceneMatchVersionMatchOptions));}
public virtual WeightedTerm[] GetWeightedTerms(){return WeightedTerm.GetWeightedTerms(this);}
public virtual void DeleteDocumentationPart(){_reader.Delete(docID);}
public string GetText(IVocabulary vocabulary){return vocabulary.ToString(null, NumberStyles.Integer, vocabulary);}
public short get(int index){return elements[index];}
public string GetImageAsString(){return Image;}
public static double range_2(double value){return range_2(value, new double[VALUE_MAX_VALUE_NUMERIC_NUMBER])}
public override void ClearWeight(int w){Weight = 0;}
public virtual int find_end(){return end;}
public virtual SrndPrimaryKeyQuery GetPrimaryQuery(){return null;}
public void DeleteApiKey(){_openAPI.DeleteApiKey(ApiKey);}
public InsertTagsRequest(): base(){return new InsertTagsRequest(defaultParams);}
public void DeletePrincipalID(string principalId){if (principalId == null){throw new ArgumentNullException("principalId cannot be null");}string oldId = principalId.String();context.Delete(oldId);}
public virtual NetworkInterfaces GetNetworkInterfaces(){return networkInterfaces;}
public override void Serialize(byte[] b, int offset){if (m_offset == 0){m_offset = 0;}UnsafeWrite(b, offset + _position, m_buf, m_offset + _size);}
public security configuration {get; private set; }
public virtual DescribeClientVPNConnectionsResponse DescribeClientVPNConnections(){return DescribeClientVPNConnections(null, null, null);}
public void Fill(double[] values, int value, long array_size){Fill(values, 0, array_size);}
public bool HasMoreCells(){return true;}
public DocsResetter(){_end = false;}
public bool AllFlagsSet(IFlagsSet other){return allFlagsSet(other);}
public virtual ModifyAccountResponse ModifyAccount(ModifyAccountRequest request){var options = new InvokeOptions();options.RequestMarshaller = ModifyAccountRequestMarshaller.Instance;options.ResponseUnmarshaller = ModifyAccountResponseUnmarshaller.Instance;return Invoke<ModifyAccountResponse>(request, options);}
public virtual E get(int k){return tokens[offset + k];}
public Sheet RemoveSheetAt(int index){return RemoveSheet(index, _sheetNames.Count == 0);}
public virtual void RemoveName(string name){names.Remove(name);}
public virtual bool Equals(object o){if (o == null){return false;}if (o is Props){Properties = o.Properties;return true;}return false;}
public virtual BuildList GetBuildList(string repo){return null;}
public MessageWriter(java.io.Writer @out){return @out;}
public void Append(Record record){_list.Append(record);}
public void close(){packfile.close();}
public virtual NGit.Api.ModelPackage GetModelPackage(){return getModelPackage();}
public CellInstance(CellReader reader, int row, int column){return this._enclosing.ConstructCell(reader, row, column, 0);}
public override Object Clone(){return this;}
public virtual UpdateS3ResourcesResponse UpdateS3Resources(UpdateS3ResourcesRequest request){var options = new InvokeOptions();options.RequestMarshaller = UpdateS3ResourcesRequestMarshaller.Instance;options.ResponseUnmarshaller = UpdateS3ResourcesResponseUnmarshaller.Instance;return Invoke<UpdateS3ResourcesResponse>(request, options);}
public virtual GroupQueryNode Add(IQueryNode node){return Add(node);}
public string getQuery(){return path.query();}
public void RemoveComment(String s){Remove(s, 0, s.Length);}
public void Reset() {ringBuffer.Reset(Constants.RING_BUFFER_STATE_INITIAL);}
public virtual void Activate(){base.Activate();}
public virtual bool DetectCharset(){return charset!= null;}
public virtual void SetRetentionPeriod(long retentionPeriod){retentionPeriod = retentionPeriod;}
public virtual void DeleteClusterSubnetGroup(ClusterSubnetGroupName group){DeleteClusterSubnetGroup(group.Name, group.Attributes, null, null);}
public virtual string Decode(byte[] b, int bOffset, int bLength){return Decode(b, bOffset, bLength);}
public override int GetDefaultPort(){return _defaultPort;}
public virtual void Stop(){_enclosing.Stop();}
public override void SeekToNextTerm(Term term){SeekTo(term.Index);}
public SeriesToChartGroupRecord(Stream input){return ReadSeriesToChartGroupRecord(input, 0, input.Available());}
public override void write(char b){throw new System.NotImplementedException();}
public virtual AuthorizeSecurityGroupResponse AuthorizeSecurityGroup(AuthorizeSecurityGroupRequest request){var options = new InvokeOptions();options.RequestMarshaller = AuthorizeSecurityGroupRequestMarshaller.Instance;options.ResponseUnmarshaller = AuthorizeSecurityGroupResponseUnmarshaller.Instance;return Invoke<AuthorizeSecurityGroupResponse>(request, options);}
public virtual void AddFile(FilePath file){this.files.Add(file);}
public void SetSize(int value){this.value = value;}
public bool SetSuppressionHighlight(bool set){suppressionHighlight = set;}
public static LOOKIntervalSet CreateFromATNState(ATNState state){return new LOOKIntervalSet(state);}
public void Serialize(ILittleEndianOutput out1){out1.Write(this.GetType().Name);}
public bool SetDups(bool useSortedAsList){return _dedupTable.Set(useSortedAsList);}
public Hashtable(int capacity, float loadFactor){return new Hashtable(this, capacity, loadFactor);}
public virtual string get(string key){return getString(key, CultureInfo.InvariantCulture);}
public virtual HyperParameterTuningJobDetail[] GetHyperParameterTuningJobs(HyperParameterTuningJobName request){var options = new InvokeOptions();options.RequestMarshaller = GetHyperParameterTuningJobNameMarshaller.Instance;options.ResponseUnmarshaller = GetHyperParameterTuningJobsResponseUnmarshaller.Instance;return Invoke<HyperParameterTuningJobDetail>(request, options);}
public override void Delete(Table table){this._enclosing.Delete(table);}
public virtual bool LessThan(ICharSequence text, IPositionOffset start, IPositionLength){return begin < text.Length && end < text.Length;}
public void freeBefore(long position){if (m_buf.position(position)){m_buf.position(position);}m_buf.position(position);}
public virtual UpdateHITTypeResponse UpdateHITType(UpdateHITTypeResponse HITTypeResponse){return UpdateHITType(HITTypeResponse.OVERFLOW);}
public recommender.json file. This updates recommender.json in the current directory.
public virtual bool Equals(BytesRef bytesRef){return _bytesRef!= null;}
public virtual int StemChars(string s){return StemChars(s.ToCharArray());}
public virtual Snapshots Describe(){return snapshots;}
public dummyFacetField(int dimension, string label, IFacetField field_1): base(dimension, label, IFacetField.DEFAULT_DIMENSION, label, IFacetField.DEFAULT_LABEL_CHAR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
public virtual DocsPart CreateDocumentationPart(string name){return DocsPart(name, null, null);}
public virtual string getValue(){return mValue;}
public override java.nio.ShortBufferEx read(short capacity){return new _ShortBufferEx(capacity);}
public virtual void UpdatePermissions(int permissions){object source = dataSources[permissions];object.Copy(source.Properties, property_1_permissions, this._enclosing);}
public Record Create(RecordInput in1){return Create(in1, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentRow, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentRow, in1.CurrentRow, in1.CurrentColumn, in1.CurrentRow, in1.CurrentRow, in1.CurrentRow, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn, in1.CurrentColumn
public virtual int GetTabCount(){return tabCount;}
public virtual void DeleteApplicationReferenceDataSource(ApplicationReferenceDataSource dataSource){Delete(dataSource.GetApplicationReferenceDataSource());}
public virtual Version CreateProjectVersion(string name){var version = GetVersion(name);if (version == null){version = Sharpen.Extensions.CreateProjectVersion(name, this);}if (version.Length == 0){throw new ArgumentException("No version number set");}return version;}
public java.nio.ByteBuffer slice(java.nio.ByteBuffer offset,_limit) {return byteBuffer.slice(offset, _limit);}
public override int ReadByte(){return _buf[_ReadIndex++];}
public override void put(long value){if (value >= 0){throw new System.IndexOutOfRangeException("value=" + value + " outOfBounds=" + (long)value.ToString("broken-out"));}else{buffer[offset + writeIndex++] = value;}}
public override void SetValue(int value){this.set(value);}
public virtual IList<IToken> GetExpectedTokens(){return current.expectedTokens;}
public virtual string ToString(){return GetCanonicalName();}
public SubmoduleInitializer(AModuleModules otherModuleModules){InitializeClasses(otherModuleModules);}
public void AddIncludeRef(IncludeRef @ref){includeMap.AddItem(@ref);}
public virtual void Enable(void){_copy = true;}
public virtual string GetValueFiller(){return _valueFiller;}
public void Serialize(DataOutput os){os.Write(GetCellRangeAsString(this));}
public static Counter newCounter(long value){return newCounter(value);}
public bool get(string key){return _string[key];}
public override void Before(Object o){base.Before(o);}
public override void Reuse(){base.Reuse();}
public new ExternalBookBlock(){this.numberOfSheets = 0;}
public virtual string GetWindowToken(){return activeWindow.GetToken().ToString();}
public push thinly { get, set}push thinly { set }
public virtual bool RecordTimeSecChanged(RecordTimeSec value){return recordTimeSec!= null? recordTimeSec == null? recordTimeSec == null : recordTimeSec.Equals(value.RecordTimeSec) && recordTimeSec.Equals(value.RecordTimeSec);}
public new ReverseStringFilter(TokenStream stream){return new ReverseStringFilter(stream);}
public BlockList(BlockListElement element){_element = element;}
public Scorer(List<Term> terms){_terms = terms;}
public override bool Equals(object o){if (o is java.util.MapClass.Entry<K, V>){return this._enclosing.Equals(o);}return false;}
public virtual charSet GetCharacterSet(){return _characterSet;}
public virtual ExperimentsDetail GetExperimentDetail(){return ExperimentsDetail.Current;}
public ESCHER(Graphics2D) : base(){this.type = typeof(EsCHERDrawing2D);}
public virtual string GetPatternText(){return patternText;}
public void DeleteRouteTable(RouteTable table){DeleteInternal(table.RouteTableIndex);}
public void Associate(VPC vpc){_VPC = vpc;}
public virtual Integration Integration { get; private set; }
public virtual void Set(string key, string value){this.Put(key, value);}
public override object Decode(byte b){return this.Decode(b, 0, b.Length);}
public virtual void Disassociate(LagConnection connection){Disassociate(connection);}
public override FileMode GetOldFileMode(){return oldFileMode;}
public virtual string ToString(){return GetCanonicalName();}
public virtual void Stop(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken)){m_enclosing.Stop(customHeaders, cancellationToken);}
public Formula String(){return Formula.String();}
public virtual IList<DominantLanguageDetectionJob> GetDominantLanguageDetectionJobs(){return null;}
public override string ToString(){return Slice.ToString(this);}
public int ParseHexInt(byte b){return _le.ParseInt(b, 16);}
public virtual void Set(string @name, string @value){attributes[@name] = @value;}
public virtual StackSetOperation GetStackSetOperation(){return null;}
public ICell GetCell(CellNum cellnum){return GetCell(cellnum);}
public override void write(byte b){throw new System.NotImplementedException();}
public virtual ResetImageAttributeResponse ResetImageAttribute(ResetImageAttributeRequest request){return ResetImageAttribute(request, null);}
public virtual void discard(){_rc4.dispose();}
public override ObjectId GetPeeledObjectId(){return null;}
public virtual void Unprecate(Domain e){Deprecate(e.domain, e.message, e.backtrace, e);}
public override void Write(ILittleEndianOutput out1){out1.Write(field_3_string);}
public virtual void Delete(string queueName){if (name == null){throw new ArgumentNullException("name cannot be null");}string queue = name.Substring(name.Length);if (queue.Length == 0){throw new ArgumentException("queue length cannot be zero");}delete_engage(queue);}
public bool SetCheckFooterAfterPackFooter(bool checkFooterAfterPackFooter){return checkFooterAfterPackFooter;}
public virtual void swap(int x, int y){swap(x, y, 0);}
public virtual int GetSize(){return size;}
public virtual UpdateAppMetricsResponse UpdateAppMetrics(UpdateAppMetricsRequest request){var options = new InvokeOptions();options.RequestMarshaller = UpdateAppMetricsRequestMarshaller.Instance;options.ResponseUnmarshaller = UpdateAppMetricsResponseUnmarshaller.Instance;return Invoke<UpdateAppMetricsResponse>(request, options);}
public virtual RecordingInformation GetRecordingInformation(){return null;}
public CreateQueueRequest(string name){var request = new CreateQueueRequest(name);request.Queue = name;request.IsAutoAck = true;return request;}
public static Area3DPxg Create(SheetIdentifier sheetIdentifier, SheetRangeIdentifier rangeIdentifier){return Create(sheetIdentifier, rangeIdentifier);}
public virtual void SetBaseline(double baseline){m_baseline = baseline;}
public virtual MoveAddressFromVPCToVPCAddressResponse MoveAddressFromVPCToVPCAddressResponse(MoveAddressFromVPCToVPCAddressResponse request){var options = new InvokeOptions();options.RequestMarshaller = MoveAddressFromVPCToVPCAddressRequestMarshaller.Instance;options.ResponseUnmarshaller = MoveAddressToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCToVPCTo[RequestUnmarshaller.Instance] return InvokeInvoke<MoveAddressResponse>(request, options);}
public virtual string GetName(){return name;}
public virtual IList<Tag> GetTags(){return Sharpen.Collections.UnmodifiableList(tags.Values);}
public virtual long GetOffset(){return areaOffset;}
public virtual void putShorts(short[] values){for (int i = 0; i < values.Length; i++){putShorts(values[i]);}}
public void Initialize(Category category){Initialize(category);}
public override void write(byte b){throw new System.NotImplementedException();}
public override IList<Task> GetImportImages(){return base.GetImportImages();}
public ColumnInfoRecord(RecordInputStream in1){int offset = in1.ReadUByte();int length = in1.ReadUByte();int x = in1.ReadUByte();int y = in1.ReadUByte();int b = in1.ReadUByte();int b2 = in1.ReadUByte();int b3 = in1.ReadUByte();int b4 = in1.ReadUByte();int b5 = in1.ReadUByte();for (int i = in1.ReadUByte(); i < length; i++){b2 = in1.ReadUByte();}}
public virtual void SetIndexDiffStatus(IndexDiffStatus status){m_indexDiffStatus = status;}
public virtual Experiment CreateExperiment(){return CreateExperiment(null, null);}
public virtual UnknownRecord Clone(){return new UnknownRecord(this._enclosing);}
public java.nio.FloatBuffer createSlice(java.nio.FloatBuffer b, java.nio.ShortBuffer c){return new java.nio.ReadWriteFloatArrayBuffer(b, c);}
public virtual IList<Schedule> GetSchedules(){return schedules;}
public virtual IList<Picture> GetImages(){return Sharpen.Collections.UnmodifiableList(GetImages(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null
public virtual void SetValues(Diff value){this._enclosing.SetValues(value);}
public String ToString(){return HSSFErrorConstants.GetText(hssF_1);}
public WorkbookSetup(Workbook workbook): base(workbook){this.workbook = workbook;this.sheetName = "Sheet1Row1";this.workbook = createSheet1Row2(workbook);}
public virtual IList<Tag> GetTags(Photo photo){return photo.tags;}
public override Scorer Create(string name, int capacity, int capacityLimit, int capacityLimit, int capacityLimit) : base(name, capacityLimit, capacityLimit, capacityLimit, capacityLimit){this.name = name;this.capacity = capacityLimit;this.type = typeof(int);}
public static IPAddress AllocStaticIpAddress(byte b){if (_staticIpAddress == null){_staticIpAddress = new IPAddress(Inet6Address.AnyAddress);}return _staticIpAddress;}
public override FeatRecord Create(RecordInputStream in1){return new FeatRecord(in1, in1);}
public virtual MergeResult Merge(MergeRequest request, MergeResponse response){try{if (Request.IsTargetModified() && Request.IsTargetModified() && Request.IsTargetNew()){return Request.CreateMergeResponse(request, response);}MergeResponse(request, response);}catch (MergeException e){return e.GetMergeResponse();}}
public virtual SnapshotSchedule Create(string name){return new SnapshotSchedule(this, name, null, null);}
public void Next(){_reader.MoveNext(); }
public virtual string get(char b){return buf.get(b, b.pos, b.len);}
public virtual IList<TableHeader> GetTables(TableHeader table){return GetTables(table.Name, table.IsIndexed, table.IsEmpty, table.IsTruncated, table.IsPositionInLine, table.IsPositionInColumn, table.IsPositionInRow, table.IsPositionInColumn, table.IsPositionInRow, table.IsPositionInColumn, table.IsPositionInRow, table.IsPositionInColumn, table.IsPositionInColumn, table.IsPositionInColumn, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInColumn, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInColumn, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInColumn, table.IsPositionInColumn, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow, table.IsPositionInRow
public virtual void EnableAlarmActions(bool enabled){modCount.Enable(enabled);}
public static NGit.Api.DiffCommand Create(DiffCommand command, object arg0, object arg1, object arg2, object arg3, object arg4, object arg5, object arg6, bool arg7, bool arg8, int arg9, bool arg10, bool arg11, bool arg12, bool arg11, bool arg12, bool arg11, bool arg12, bool arg11, bool arg12, bool arg12, bool arg13, bool arg12, bool arg12, bool arg12, bool_delete){if (delete){return }if (delete){return }return new NGit.Api.DiffCommand(command, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg12, arg12, arg12, arg12, arg13, arg12, arg12, arg13, arg12, arg13, arg12, arg13, arg13, arg12, arg13, arg13, arg12, arg13, arg12, arg13, arg13, arg13, arg13, arg13, arg13, arg13, arg12, arg12, arg12, arg12, arg
public virtual bool Equals(State[] states){return states.Length == 0;}
public EnglishPossessiveFilter(TokenStream input){return new EnglishPossessiveFilter(input);}
public virtual void ClearFormatting(){m_formatting = null;}
public int get(int index) {return array[index];}
public virtual void DeleteRouteResponse(RouteResponse response){RouteResponseHelper.DeleteRouteResponse(response);}
public virtual string ToString(){return GetType().Name + "@" + GetHashCode().ToString("x") + " lockFactory=" + LockFactory;}
public URL CreatePresignedDomainURL(string domain){return "https:" + domain + "/presigneddomain.do?";}
public virtual void writeChar(char c){throw new System.NotImplementedException();}
public virtual SSTRecord GetSSTRecord(){return (SSTRecord)GetRecord(Constants.SSFRecordId);}
public virtual string ToString(){return GetCanonicalName();}
public virtual bool IsSaturated(BloomFilter bloomFilter){return _bloomFilter.IsSaturated(bloomFilter);}
public bool IgnoreCase(){return _ignoreCase;}
public string ToString(){return Query(null, null);}
public virtual void Delete(){this._enclosing.Delete(this.dataSource);}
public virtual void Reboot(RebootNodeRequest request){if (request.IsSystem){RebootSystem(request);}else{RebootSystem(request);}}
public void ProcessChildRecords(byte[] rawChildRecords){escherRecords = ConvertRawChildRecords(rawChildRecords);}
public virtual void CreateOrUpdateTagsForApp(string appName, string version){CreateOrUpdateTagsForApp(appName, version);}
public virtual void close(){_writer.close();}
public java.io.InputStream get(object resource){throw new System.NotImplementedException();}
public virtual string ToString(){return GetCanonicalName();}
public virtual int index(){return index;}
public string GetQuery(){return GetQuery(true);}
public virtual NGit.Storage.File.Record GetRecord(){return this._enclosing.GetRecord(this.name);}
public virtual bool IsOutputCommand(){return true;}
public InterfaceCreate(DataInput in){this.m_dataInput = in.m_dataInput;}
public override void Serialize(ILittleEndianOutput out1){out1.Write(field_1_password);}
public virtual void StopDominantLanguageDetectionJob(){m_execution = false;}
public virtual void SetConnectTimeout(int m_timeout){connectionTimeout = m_timeout;}
public virtual GatewayGroup DescribeGatewayGroupResponse DescribeGatewayGroup(GatewayGroupStatusRequest request){var options = new InvokeOptions();options.RequestMarshaller = DescribeGatewayGroupRequestMarshaller.Instance;options.ResponseUnmarshaller = DescribeGatewayGroupResponseUnmarshaller.Instance;return Invoke<GatewayGroupResponse>(request, options);}
public java.nio.ByteBuffer slice(java.nio.ByteBuffer offset,_limit) {return byteBuffer.slice(offset, _limit);}
public virtual string join(ICollection<string> collection, string separator, char lastSeparator){return join(string.Empty, collection, separator, lastSeparator);}
public override string ToString(){return this.operator.ToString();}
public virtual ListSubscriptionsResponse ListSubscriptions(string arn){return ListSubscriptionsResponse( arn, null);}
public override byte ReadByte(){return delegate1.ReadByte();}
public virtual void ClientVPNConnectionTerminate(){ClientVPNConnection c = (ClientVPNConnection)Start(clientVPNConnection);}
public queue_url(string queue_url){this.queue_url = queue_url;}
public override void Serialize(ILittleEndianOutput out1){out1.WriteShort(field_1_error_code);}
public static int GetCommonValue(Output output){return output.GetCommonValue();}
public virtual void Create(IToken token){CreateToken(token, TokenKind.New);}
public int get(byte b){if (get(b) == null){return -1;}return get(b, 0);}
public override void Fill(byte[] b){Fill(b, 0, b.Length);}
public CloudFrontOriginAccessIdentity CreateCloudFrontOriginAccessIdentity(){return new CloudFrontOriginAccessIdentity(this);}
public virtual bool NamespaceAware(Parser parser){return true;}
public virtual void SetOverrideFlag(bool overrideFlag){overrideFlag = overrideFlag;}
public override string ToString(){return base.ToString() + "[]";}
public virtual IndexReader GetIndexReader(){return _indexReader;}
public int keyAt(int key){return keys[key];}
public Record(RecordRecord record, int length) throws IOException{return null;}
public override long Length(){return _size;}
public override void Read(Record record){if (record.Password!= null){_passwordRecord.Read(record);_passwordRecord = new PasswordRecord(record);_passwordRecord.Field_1_password = record.Password;_passwordRecord.Field_2_salt = record.Field_2_salt;}else{_passwordRecord = new PasswordRecord(record.Field_3_salt, record.Field_4_salt);}}
public java.util.HashMap<K, V>(){return new java.util.HashMap<K, V>.HashMap(this._capacity, this._loadFactor);}
public override void run(){base.run();}
public virtual void DeleteLoginProfile(string userName){DeleteUser(userName, true);}
public virtual E peek(E value){return list.remove(value);}
public Photo Create(Cloud Photo, Cloud PhotoOptions){var options = new PhotoOptions();options.CloudPhotoOptions = cloudPhotoOptions;options.InitialState = this.InitialState;return this;}
public virtual string GetName(){return name;}
public virtual void bogus_mark(char b){if (m_len >= m_buf.size()){throw new System.IO.IOException("Buffer has been bogus.");}m_len -= m_len;}
public virtual void SetObjectChecker(ObjectChecker checker){this.checker = checker;}
public override void SetBaseReference(AreaEval areaEval){_baseRef = areaEval.GetBaseReference();}
public VPCEndpoint(string vpcEndpointName){_vpcEndpointName = vpcEndpointName;}
public void DeregisterWorkspaceDirectory(FilePath workspaceDirectory){Deregister(workspaceDirectory.FullName);}
public override ChartFRTInfoRecord Create(RecordInputStream in1){return new ChartFRTInfoRecord(this, in1);}
public Merger(){return this;}
public IDataSource CreateDataSource(IDataSource source){return CreateDataSource(source, null, null);}
public void ClearDecisionToDFA(int[] decisionToDFA){Array.Clear(decisionToDFA, 0, decisionToDFA.Length); }
public virtual void RemoveName(string name){names.Remove(name);}
public virtual string GetRightMarginString(){return GetRightMarginString(true);}
public virtual Object Clone(){return this;}
public virtual void AddProcessors(IProcessor[] processors){for (int i = 0; i < processors.Length; i++){AddProcessor(processors[i]);}}
public String ToString(){return "ref(" + @ref + ")";}
public override void put(byte b){throw new System.NotImplementedException();}
public override void SetFileMode(int mode){this.mode = mode;}
public java.nio.ByteBuffer slice(java.nio.ByteBuffer offset,_limit) {return byteBuffer.slice(offset, _limit);}
public override void SetValueAt(int index, V value){if (index < 0 || values[index] == null){throw new IndexOutOfRangeException(index.ToString());}values[index] = value;}
public override void put(float value){buffer.put(value);}
public virtual double ValueMax(double[] x){return Evaluate(x, 0, x.Length);}
public webhook_v1.RequestParameters = new InvokeOptions();return webhook_v1.ResponseParameters = new InvokeOptions();}
public void DeleteDomainNameAndAttributes(string itemName){_domainName = itemName;_attributes = null;}
public String ToString(){return HSSFErrorConstants.GetText(hssF_1);}
public virtual bool Success(void){base.Success(this);}
public override void Set(byte b){value = b;}
public virtual ConnectionInformation GetConnectionInformation(){return connectionInformation;}
public DeletePhotos request(DeletePhotos request_1){return new DeletePhotos(request_1);}
public virtual void append(E e){throw new System.NotImplementedException();}
public java.nio.ReadWriteHeapBufferEx(){return new java.nio.ReadWriteHeapBufferEx(this, capacity);}
public virtual SubQuery Get(int index){return _subQueries[index];}
public virtual Score GetCurrentScore(){return score;}
public string GetText(IVocabulary vocabulary){return vocabulary.ToString(null, NumberStyles.Integer, vocabulary);}
public virtual LogPatternDetail GetLogPatternDetail(){return GetLogPatternDetail(null);}
public virtual void RegisterMulticastGroupMembers(List<MulticastGroup> members){_multicastGroupMembers = members;}
public virtual PhoneNumber GetPhoneNumber(){return phoneNumber;}
public virtual E data(){return _data;}
public virtual bool IsDirected(IPath node){return this.IsPathPrefix(node.Name);}
public void DeleteServerCertificate(string name){Delete(name, null);}
public virtual void appendDouble(double value){appendInternal(value);}
public virtual IEvaluationDetail GetEvaluationDetail(IEvaluationDetail e){return e.EvaluationDetail;}
public string GetLinkedDataRecordName(){return _linkedDataRecordName;}
public virtual bool matches(string text){return strings.Match(text, StringComparison.Ordinal)!= null;}
public virtual LifecyclePolicyPreview GetLifecyclePolicyPreview(){return lifecyclePolicyPreview;}
public virtual TokenStream Tokenize(int start, int length, string word){return Tokenize(start, length, word, 0, null);}
public override void Serialize(ObjectOutput out1){out1.Write(Serialize(this));}
public virtual string ToString(){return GetCanonicalName();}
public virtual void SetRemoteAddress(string address){remote = address;}
public void Collapse(int row, int column){CheckPosition(row, column);}
public virtual void SetSkillGroupWithRoom(Guild skillGroup, int room){if (rooms!= null){foreach (Guild skill in rooms){SetSkillGroup(skillGroup, room);}}}
public virtual string GetSURT(){return SURT.ToString(CultureInfo.InvariantCulture);}
public QueryConfigHandler GetQueryConfigHandler(){return _queryConfigHandler;}
public virtual string GetName(){return GetName();}
