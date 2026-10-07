package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import u.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalr {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzalp zzalpVar, String str) {
        StringBuilder sbC = e.c("# ", str);
        zzd(zzalpVar, sbC, 0);
        return sbC.toString();
    }

    public static void zzb(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzamq.zza(new zzajc(((String) obj).getBytes(zzakq.zzb))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzajf) {
            sb2.append(": \"");
            sb2.append(zzamq.zza((zzajf) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzakk) {
            sb2.append(" {");
            zzd((zzakk) obj, sb2, i + 2);
            sb2.append("\n");
            zzc(i, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i11 = i + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i11, "key", entry.getKey());
        zzb(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        zzc(i, sb2);
        sb2.append("}");
    }

    private static void zzc(int i, StringBuilder sb2) {
        while (i > 0) {
            int i10 = 80;
            if (i <= 80) {
                i10 = i;
            }
            sb2.append(zza, 0, i10);
            i -= i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzalp zzalpVar, StringBuilder sb2, int i) {
        int i10;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzalpVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i10);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i, strSubstring.substring(0, strSubstring.length() - 4), zzakk.zzD(method2, zzalpVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i, strSubstring.substring(0, strSubstring.length() - 3), zzakk.zzD(method, zzalpVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzD = zzakk.zzD(method4, zzalpVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzD instanceof Boolean) {
                            if (((Boolean) objZzD).booleanValue()) {
                                zzb(sb2, i, strSubstring, objZzD);
                            }
                        } else if (objZzD instanceof Integer) {
                            if (((Integer) objZzD).intValue() != 0) {
                                zzb(sb2, i, strSubstring, objZzD);
                            }
                        } else if (objZzD instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzD).floatValue()) != 0) {
                                zzb(sb2, i, strSubstring, objZzD);
                            }
                        } else if (!(objZzD instanceof Double)) {
                            if (objZzD instanceof String) {
                                zEquals = objZzD.equals("");
                            } else if (objZzD instanceof zzajf) {
                                zEquals = objZzD.equals(zzajf.zzb);
                            } else if (objZzD instanceof zzalp) {
                                if (objZzD != ((zzalp) objZzD).zzM()) {
                                    zzb(sb2, i, strSubstring, objZzD);
                                }
                            } else if (!(objZzD instanceof Enum) || ((Enum) objZzD).ordinal() != 0) {
                                zzb(sb2, i, strSubstring, objZzD);
                            }
                            if (!zEquals) {
                                zzb(sb2, i, strSubstring, objZzD);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzD).doubleValue()) != 0) {
                            zzb(sb2, i, strSubstring, objZzD);
                        }
                    } else if (((Boolean) zzakk.zzD(method5, zzalpVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i, strSubstring, objZzD);
                    }
                }
            }
            i10 = 3;
        }
        if (zzalpVar instanceof zzakh) {
            throw null;
        }
        zzamw zzamwVar = ((zzakk) zzalpVar).zzc;
        if (zzamwVar != null) {
            zzamwVar.zzi(sb2, i);
        }
    }
}
