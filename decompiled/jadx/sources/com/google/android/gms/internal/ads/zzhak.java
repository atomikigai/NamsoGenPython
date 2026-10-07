package com.google.android.gms.internal.ads;

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
final class zzhak {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzhai zzhaiVar, String str) {
        StringBuilder sbC = e.c("# ", str);
        zzd(zzhaiVar, sbC, 0);
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
            sb2.append(zzhbl.zza(zzgxp.zzw((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzgxp) {
            sb2.append(": \"");
            sb2.append(zzhbl.zza((zzgxp) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzgyx) {
            sb2.append(" {");
            zzd((zzgyx) obj, sb2, i + 2);
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
    private static void zzd(zzhai zzhaiVar, StringBuilder sb2, int i) {
        int i10;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhaiVar.getClass().getDeclaredMethods();
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
                zzb(sb2, i, strSubstring.substring(0, strSubstring.length() - 4), zzgyx.zzbR(method2, zzhaiVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i, strSubstring.substring(0, strSubstring.length() - 3), zzgyx.zzbR(method, zzhaiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzbR = zzgyx.zzbR(method4, zzhaiVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzbR instanceof Boolean) {
                            if (((Boolean) objZzbR).booleanValue()) {
                                zzb(sb2, i, strSubstring, objZzbR);
                            }
                        } else if (objZzbR instanceof Integer) {
                            if (((Integer) objZzbR).intValue() != 0) {
                                zzb(sb2, i, strSubstring, objZzbR);
                            }
                        } else if (objZzbR instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzbR).floatValue()) != 0) {
                                zzb(sb2, i, strSubstring, objZzbR);
                            }
                        } else if (!(objZzbR instanceof Double)) {
                            if (objZzbR instanceof String) {
                                zEquals = objZzbR.equals("");
                            } else if (objZzbR instanceof zzgxp) {
                                zEquals = objZzbR.equals(zzgxp.zzb);
                            } else if (objZzbR instanceof zzhai) {
                                if (objZzbR != ((zzhai) objZzbR).zzbt()) {
                                    zzb(sb2, i, strSubstring, objZzbR);
                                }
                            } else if (!(objZzbR instanceof Enum) || ((Enum) objZzbR).ordinal() != 0) {
                                zzb(sb2, i, strSubstring, objZzbR);
                            }
                            if (!zEquals) {
                                zzb(sb2, i, strSubstring, objZzbR);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzbR).doubleValue()) != 0) {
                            zzb(sb2, i, strSubstring, objZzbR);
                        }
                    } else if (((Boolean) zzgyx.zzbR(method5, zzhaiVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i, strSubstring, objZzbR);
                    }
                }
            }
            i10 = 3;
        }
        if (zzhaiVar instanceof zzgyt) {
            Iterator itZzf = ((zzgyt) zzhaiVar).zza.zzf();
            while (itZzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzf.next();
                zzb(sb2, i, q1.a.j(((zzgyu) entry2.getKey()).zza, "[", "]"), entry2.getValue());
            }
        }
        zzhbo zzhboVar = ((zzgyx) zzhaiVar).zzt;
        if (zzhboVar != null) {
            zzhboVar.zzi(sb2, i);
        }
    }
}
