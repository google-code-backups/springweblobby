package com.springrts.unitsync.impl.jna;
import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
/**
 * JNA Wrapper for library <b>unitsync</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class UnitsyncLibrary implements Library {
	public static native java.lang.String GetNextError();
	public static native java.lang.String GetSpringVersion();
	public static native java.lang.String GetSpringVersionPatchset();
	public static native boolean IsSpringReleaseVersion();
	public static native int Init(boolean isServer, int id);
	public static native void UnInit();
	public static native java.lang.String GetWritableDataDirectory();
	public static native int GetDataDirectoryCount();
	public static native java.lang.String GetDataDirectory(int index);
	public static native int ProcessUnits();
	public static native int ProcessUnitsNoChecksum();
	public static native int GetUnitCount();
	public static native java.lang.String GetUnitName(int unit);
	public static native java.lang.String GetFullUnitName(int unit);
	@java.lang.Deprecated 
	public static native void AddArchive(Pointer archiveName);
	public static native void AddArchive(java.lang.String archiveName);
	@java.lang.Deprecated 
	public static native void AddAllArchives(Pointer rootArchiveName);
	public static native void AddAllArchives(java.lang.String rootArchiveName);
	public static native void RemoveAllArchives();
	@java.lang.Deprecated 
	public static native int GetArchiveChecksum(Pointer archiveName);
	public static native int GetArchiveChecksum(java.lang.String archiveName);
	@java.lang.Deprecated 
	public static native java.lang.String GetArchivePath(Pointer archiveName);
	public static native java.lang.String GetArchivePath(java.lang.String archiveName);
	public static native int GetMapCount();
	public static native java.lang.String GetMapName(int index);
	public static native java.lang.String GetMapFileName(int index);
	public static native java.lang.String GetMapDescription(int index);
	public static native java.lang.String GetMapAuthor(int index);
	public static native int GetMapWidth(int index);
	public static native int GetMapHeight(int index);
	public static native int GetMapTidalStrength(int index);
	public static native int GetMapWindMin(int index);
	public static native int GetMapWindMax(int index);
	public static native int GetMapGravity(int index);
	public static native int GetMapResourceCount(int index);
	public static native java.lang.String GetMapResourceName(int index, int resourceIndex);
	public static native float GetMapResourceMax(int index, int resourceIndex);
	public static native int GetMapResourceExtractorRadius(int index, int resourceIndex);
	public static native int GetMapPosCount(int index);
	public static native float GetMapPosX(int index, int posIndex);
	public static native float GetMapPosZ(int index, int posIndex);
	@java.lang.Deprecated 
	public static native float GetMapMinHeight(Pointer mapName);
	public static native float GetMapMinHeight(java.lang.String mapName);
	@java.lang.Deprecated 
	public static native float GetMapMaxHeight(Pointer mapName);
	public static native float GetMapMaxHeight(java.lang.String mapName);
	@java.lang.Deprecated 
	public static native int GetMapArchiveCount(Pointer mapName);
	public static native int GetMapArchiveCount(java.lang.String mapName);
	public static native java.lang.String GetMapArchiveName(int index);
	public static native int GetMapChecksum(int index);
	@java.lang.Deprecated 
	public static native int GetMapChecksumFromName(Pointer mapName);
	public static native int GetMapChecksumFromName(java.lang.String mapName);
	@java.lang.Deprecated 
	public static native Pointer GetMinimap(Pointer fileName, int mipLevel);
	public static native Pointer GetMinimap(java.lang.String fileName, int mipLevel);
	@java.lang.Deprecated 
	public static native int GetInfoMapSize(Pointer mapName, Pointer name, IntByReference width, IntByReference height);
	public static native int GetInfoMapSize(java.lang.String mapName, java.lang.String name, IntBuffer width, IntBuffer height);
	@java.lang.Deprecated 
	public static native int GetInfoMap(Pointer mapName, Pointer name, Pointer data, int typeHint);
	public static native int GetInfoMap(java.lang.String mapName, java.lang.String name, ByteBuffer data, int typeHint);
	public static native int GetSkirmishAICount();
	public static native int GetSkirmishAIInfoCount(int index);
	public static native java.lang.String GetInfoKey(int index);
	public static native java.lang.String GetInfoType(int index);
	public static native java.lang.String GetInfoValue(int index);
	public static native java.lang.String GetInfoValueString(int index);
	public static native int GetInfoValueInteger(int index);
	public static native float GetInfoValueFloat(int index);
	public static native boolean GetInfoValueBool(int index);
	public static native java.lang.String GetInfoDescription(int index);
	public static native int GetSkirmishAIOptionCount(int index);
	public static native int GetPrimaryModCount();
	public static native int GetPrimaryModInfoCount(int index);
	public static native java.lang.String GetPrimaryModName(int index);
	public static native java.lang.String GetPrimaryModShortName(int index);
	public static native java.lang.String GetPrimaryModVersion(int index);
	public static native java.lang.String GetPrimaryModMutator(int index);
	public static native java.lang.String GetPrimaryModGame(int index);
	public static native java.lang.String GetPrimaryModShortGame(int index);
	public static native java.lang.String GetPrimaryModDescription(int index);
	public static native java.lang.String GetPrimaryModArchive(int index);
	public static native int GetPrimaryModArchiveCount(int index);
	public static native java.lang.String GetPrimaryModArchiveList(int archive);
	@java.lang.Deprecated 
	public static native int GetPrimaryModIndex(Pointer name);
	public static native int GetPrimaryModIndex(java.lang.String name);
	public static native int GetPrimaryModChecksum(int index);
	@java.lang.Deprecated 
	public static native int GetPrimaryModChecksumFromName(Pointer name);
	public static native int GetPrimaryModChecksumFromName(java.lang.String name);
	public static native int GetSideCount();
	public static native java.lang.String GetSideName(int side);
	public static native java.lang.String GetSideStartUnit(int side);
	@java.lang.Deprecated 
	public static native int GetMapOptionCount(Pointer mapName);
	public static native int GetMapOptionCount(java.lang.String mapName);
	public static native int GetModOptionCount();
	@java.lang.Deprecated 
	public static native int GetCustomOptionCount(Pointer fileName);
	public static native int GetCustomOptionCount(java.lang.String fileName);
	public static native java.lang.String GetOptionKey(int optIndex);
	public static native java.lang.String GetOptionScope(int optIndex);
	public static native java.lang.String GetOptionName(int optIndex);
	public static native java.lang.String GetOptionSection(int optIndex);
	public static native java.lang.String GetOptionStyle(int optIndex);
	public static native java.lang.String GetOptionDesc(int optIndex);
	public static native int GetOptionType(int optIndex);
	public static native int GetOptionBoolDef(int optIndex);
	public static native float GetOptionNumberDef(int optIndex);
	public static native float GetOptionNumberMin(int optIndex);
	public static native float GetOptionNumberMax(int optIndex);
	public static native float GetOptionNumberStep(int optIndex);
	public static native java.lang.String GetOptionStringDef(int optIndex);
	public static native int GetOptionStringMaxLen(int optIndex);
	public static native int GetOptionListCount(int optIndex);
	public static native java.lang.String GetOptionListDef(int optIndex);
	public static native java.lang.String GetOptionListItemKey(int optIndex, int itemIndex);
	public static native java.lang.String GetOptionListItemName(int optIndex, int itemIndex);
	public static native java.lang.String GetOptionListItemDesc(int optIndex, int itemIndex);
	public static native int GetModValidMapCount();
	public static native java.lang.String GetModValidMap(int index);
	@java.lang.Deprecated 
	public static native int OpenFileVFS(Pointer name);
	public static native int OpenFileVFS(java.lang.String name);
	public static native void CloseFileVFS(int file);
	@java.lang.Deprecated 
	public static native int ReadFileVFS(int file, Pointer buf, int numBytes);
	public static native int ReadFileVFS(int file, ByteBuffer buf, int numBytes);
	public static native int FileSizeVFS(int file);
	@java.lang.Deprecated 
	public static native int InitFindVFS(Pointer pattern);
	public static native int InitFindVFS(java.lang.String pattern);
	@java.lang.Deprecated 
	public static native int InitDirListVFS(Pointer path, Pointer pattern, Pointer modes);
	public static native int InitDirListVFS(java.lang.String path, java.lang.String pattern, java.lang.String modes);
	@java.lang.Deprecated 
	public static native int InitSubDirsVFS(Pointer path, Pointer pattern, Pointer modes);
	public static native int InitSubDirsVFS(java.lang.String path, java.lang.String pattern, java.lang.String modes);
	@java.lang.Deprecated 
	public static native int FindFilesVFS(int file, Pointer nameBuf, int size);
	public static native int FindFilesVFS(int file, ByteBuffer nameBuf, int size);
	@java.lang.Deprecated 
	public static native int OpenArchive(Pointer name);
	public static native int OpenArchive(java.lang.String name);
	@java.lang.Deprecated 
	public static native int OpenArchiveType(Pointer name, Pointer type);
	public static native int OpenArchiveType(java.lang.String name, java.lang.String type);
	public static native void CloseArchive(int archive);
	@java.lang.Deprecated 
	public static native int FindFilesArchive(int archive, int file, Pointer nameBuf, IntByReference size);
	public static native int FindFilesArchive(int archive, int file, ByteBuffer nameBuf, IntBuffer size);
	@java.lang.Deprecated 
	public static native int OpenArchiveFile(int archive, Pointer name);
	public static native int OpenArchiveFile(int archive, java.lang.String name);
	@java.lang.Deprecated 
	public static native int ReadArchiveFile(int archive, int file, Pointer buffer, int numBytes);
	public static native int ReadArchiveFile(int archive, int file, ByteBuffer buffer, int numBytes);
	public static native void CloseArchiveFile(int archive, int file);
	public static native int SizeArchiveFile(int archive, int file);
	@java.lang.Deprecated 
	public static native void SetSpringConfigFile(Pointer fileNameAsAbsolutePath);
	public static native void SetSpringConfigFile(java.lang.String fileNameAsAbsolutePath);
	public static native java.lang.String GetSpringConfigFile();
	@java.lang.Deprecated 
	public static native java.lang.String GetSpringConfigString(Pointer name, Pointer defValue);
	public static native java.lang.String GetSpringConfigString(java.lang.String name, java.lang.String defValue);
	@java.lang.Deprecated 
	public static native int GetSpringConfigInt(Pointer name, int defValue);
	public static native int GetSpringConfigInt(java.lang.String name, int defValue);
	@java.lang.Deprecated 
	public static native float GetSpringConfigFloat(Pointer name, float defValue);
	public static native float GetSpringConfigFloat(java.lang.String name, float defValue);
	@java.lang.Deprecated 
	public static native void SetSpringConfigString(Pointer name, Pointer value);
	public static native void SetSpringConfigString(java.lang.String name, java.lang.String value);
	@java.lang.Deprecated 
	public static native void SetSpringConfigInt(Pointer name, int value);
	public static native void SetSpringConfigInt(java.lang.String name, int value);
	@java.lang.Deprecated 
	public static native void SetSpringConfigFloat(Pointer name, float value);
	public static native void SetSpringConfigFloat(java.lang.String name, float value);
	public static native void lpClose();
	@java.lang.Deprecated 
	public static native int lpOpenFile(Pointer fileName, Pointer fileModes, Pointer accessModes);
	public static native int lpOpenFile(java.lang.String fileName, java.lang.String fileModes, java.lang.String accessModes);
	@java.lang.Deprecated 
	public static native int lpOpenSource(Pointer source, Pointer accessModes);
	public static native int lpOpenSource(java.lang.String source, java.lang.String accessModes);
	public static native int lpExecute();
	public static native java.lang.String lpErrorLog();
	public static native void lpAddTableInt(int key, int override);
	@java.lang.Deprecated 
	public static native void lpAddTableStr(Pointer key, int override);
	public static native void lpAddTableStr(java.lang.String key, int override);
	public static native void lpEndTable();
	public static native void lpAddIntKeyIntVal(int key, int value);
	@java.lang.Deprecated 
	public static native void lpAddStrKeyIntVal(Pointer key, int value);
	public static native void lpAddStrKeyIntVal(java.lang.String key, int value);
	public static native void lpAddIntKeyBoolVal(int key, int value);
	@java.lang.Deprecated 
	public static native void lpAddStrKeyBoolVal(Pointer key, int value);
	public static native void lpAddStrKeyBoolVal(java.lang.String key, int value);
	public static native void lpAddIntKeyFloatVal(int key, float value);
	@java.lang.Deprecated 
	public static native void lpAddStrKeyFloatVal(Pointer key, float value);
	public static native void lpAddStrKeyFloatVal(java.lang.String key, float value);
	@java.lang.Deprecated 
	public static native void lpAddIntKeyStrVal(int key, Pointer value);
	public static native void lpAddIntKeyStrVal(int key, java.lang.String value);
	@java.lang.Deprecated 
	public static native void lpAddStrKeyStrVal(Pointer key, Pointer value);
	public static native void lpAddStrKeyStrVal(java.lang.String key, java.lang.String value);
	public static native int lpRootTable();
	@java.lang.Deprecated 
	public static native int lpRootTableExpr(Pointer expr);
	public static native int lpRootTableExpr(java.lang.String expr);
	public static native int lpSubTableInt(int key);
	@java.lang.Deprecated 
	public static native int lpSubTableStr(Pointer key);
	public static native int lpSubTableStr(java.lang.String key);
	@java.lang.Deprecated 
	public static native int lpSubTableExpr(Pointer expr);
	public static native int lpSubTableExpr(java.lang.String expr);
	public static native void lpPopTable();
	public static native int lpGetKeyExistsInt(int key);
	@java.lang.Deprecated 
	public static native int lpGetKeyExistsStr(Pointer key);
	public static native int lpGetKeyExistsStr(java.lang.String key);
	public static native int lpGetIntKeyType(int key);
	@java.lang.Deprecated 
	public static native int lpGetStrKeyType(Pointer key);
	public static native int lpGetStrKeyType(java.lang.String key);
	public static native int lpGetIntKeyListCount();
	public static native int lpGetIntKeyListEntry(int index);
	public static native int lpGetStrKeyListCount();
	public static native java.lang.String lpGetStrKeyListEntry(int index);
	public static native int lpGetIntKeyIntVal(int key, int defValue);
	@java.lang.Deprecated 
	public static native int lpGetStrKeyIntVal(Pointer key, int defValue);
	public static native int lpGetStrKeyIntVal(java.lang.String key, int defValue);
	public static native int lpGetIntKeyBoolVal(int key, int defValue);
	@java.lang.Deprecated 
	public static native int lpGetStrKeyBoolVal(Pointer key, int defValue);
	public static native int lpGetStrKeyBoolVal(java.lang.String key, int defValue);
	public static native float lpGetIntKeyFloatVal(int key, float defValue);
	@java.lang.Deprecated 
	public static native float lpGetStrKeyFloatVal(Pointer key, float defValue);
	public static native float lpGetStrKeyFloatVal(java.lang.String key, float defValue);
	@java.lang.Deprecated 
	public static native java.lang.String lpGetIntKeyStrVal(int key, Pointer defValue);
	public static native java.lang.String lpGetIntKeyStrVal(int key, java.lang.String defValue);
	@java.lang.Deprecated 
	public static native java.lang.String lpGetStrKeyStrVal(Pointer key, Pointer defValue);
	public static native java.lang.String lpGetStrKeyStrVal(java.lang.String key, java.lang.String defValue);
}