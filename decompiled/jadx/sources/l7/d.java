package l7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.i0;
import da.v;
import e6.r3;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new r3(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcel f6854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f6856d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6857f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6858r;

    public d(int i, Parcel parcel, h hVar) {
        this.f6853a = i;
        i0.i(parcel);
        this.f6854b = parcel;
        this.f6855c = 2;
        this.f6856d = hVar;
        this.e = hVar == null ? null : hVar.f6867c;
        this.f6857f = 2;
    }

    public static void e(StringBuilder sb2, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a) entry.getValue()).f6848r, entry);
        }
        sb2.append('{');
        int iS = com.bumptech.glide.c.S(parcel);
        boolean z4 = false;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i);
            if (entry2 != null) {
                if (z4) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                a aVar = (a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                k7.a aVar2 = aVar.f6852v;
                String str2 = aVar.f6850t;
                int i10 = aVar.f6846d;
                if (aVar2 != null) {
                    switch (i10) {
                        case 0:
                            g(sb2, aVar, b.zaD(aVar, Integer.valueOf(com.bumptech.glide.c.J(i, parcel))));
                            break;
                        case 1:
                            int iO = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iO == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iO);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            g(sb2, aVar, b.zaD(aVar, bigInteger2));
                            break;
                        case 2:
                            g(sb2, aVar, b.zaD(aVar, Long.valueOf(com.bumptech.glide.c.M(i, parcel))));
                            break;
                        case 3:
                            g(sb2, aVar, b.zaD(aVar, Float.valueOf(com.bumptech.glide.c.H(i, parcel))));
                            break;
                        case 4:
                            com.bumptech.glide.c.U(parcel, i, 8);
                            g(sb2, aVar, b.zaD(aVar, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            g(sb2, aVar, b.zaD(aVar, com.bumptech.glide.c.d(i, parcel)));
                            break;
                        case 6:
                            g(sb2, aVar, b.zaD(aVar, Boolean.valueOf(com.bumptech.glide.c.E(i, parcel))));
                            break;
                        case 7:
                            g(sb2, aVar, b.zaD(aVar, com.bumptech.glide.c.i(i, parcel)));
                            break;
                        case 8:
                        case 9:
                            g(sb2, aVar, b.zaD(aVar, com.bumptech.glide.c.f(i, parcel)));
                            break;
                        case 10:
                            Bundle bundleE = com.bumptech.glide.c.e(i, parcel);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleE.keySet()) {
                                String string = bundleE.getString(str3);
                                i0.i(string);
                                map2.put(str3, string);
                            }
                            g(sb2, aVar, b.zaD(aVar, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(v.f(i10, "Unknown field out type = "));
                    }
                } else if (aVar.e) {
                    sb2.append("[");
                    switch (i10) {
                        case 0:
                            int[] iArrG = com.bumptech.glide.c.g(i, parcel);
                            int length = iArrG.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(iArrG[i11]);
                            }
                            break;
                        case 1:
                            int iO2 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iO2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i12 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i12];
                                for (int i13 = 0; i13 < i12; i13++) {
                                    bigIntegerArr[i13] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iO2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i14 = 0; i14 < length2; i14++) {
                                if (i14 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(bigIntegerArr[i14]);
                            }
                            break;
                        case 2:
                            int iO3 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iO3 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iO3);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i15 = 0; i15 < length3; i15++) {
                                if (i15 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(jArrCreateLongArray[i15]);
                            }
                            break;
                        case 3:
                            int iO4 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iO4 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iO4);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i16 = 0; i16 < length4; i16++) {
                                if (i16 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(fArrCreateFloatArray[i16]);
                            }
                            break;
                        case 4:
                            int iO5 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iO5 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iO5);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i17 = 0; i17 < length5; i17++) {
                                if (i17 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(dArrCreateDoubleArray[i17]);
                            }
                            break;
                        case 5:
                            int iO6 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iO6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i18 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i18];
                                for (int i19 = 0; i19 < i18; i19++) {
                                    bigDecimalArr[i19] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iO6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i20 = 0; i20 < length6; i20++) {
                                if (i20 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(bigDecimalArr[i20]);
                            }
                            break;
                        case 6:
                            int iO7 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iO7 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iO7);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i21 = 0; i21 < length7; i21++) {
                                if (i21 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(zArrCreateBooleanArray[i21]);
                            }
                            break;
                        case 7:
                            String[] strArrJ = com.bumptech.glide.c.j(i, parcel);
                            int length8 = strArrJ.length;
                            for (int i22 = 0; i22 < length8; i22++) {
                                if (i22 != 0) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(strArrJ[i22]);
                                sb2.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int iO8 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iO8 == 0) {
                                parcelArr = null;
                            } else {
                                int i23 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i23];
                                for (int i24 = 0; i24 < i23; i24++) {
                                    int i25 = parcel.readInt();
                                    if (i25 != 0) {
                                        int iDataPosition9 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition9, i25);
                                        parcelArr2[i24] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition9 + i25);
                                    } else {
                                        parcelArr2[i24] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition8 + iO8);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i26 = 0; i26 < length9; i26++) {
                                if (i26 > 0) {
                                    sb2.append(",");
                                }
                                parcelArr[i26].setDataPosition(0);
                                i0.i(str2);
                                i0.i(aVar.f6851u);
                                Map map3 = (Map) aVar.f6851u.f6866b.get(str2);
                                i0.i(map3);
                                e(sb2, map3, parcelArr[i26]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (i10) {
                        case 0:
                            sb2.append(com.bumptech.glide.c.J(i, parcel));
                            break;
                        case 1:
                            int iO9 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iO9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition10 + iO9);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb2.append(bigInteger);
                            break;
                        case 2:
                            sb2.append(com.bumptech.glide.c.M(i, parcel));
                            break;
                        case 3:
                            sb2.append(com.bumptech.glide.c.H(i, parcel));
                            break;
                        case 4:
                            com.bumptech.glide.c.U(parcel, i, 8);
                            sb2.append(parcel.readDouble());
                            break;
                        case 5:
                            sb2.append(com.bumptech.glide.c.d(i, parcel));
                            break;
                        case 6:
                            sb2.append(com.bumptech.glide.c.E(i, parcel));
                            break;
                        case 7:
                            String strI = com.bumptech.glide.c.i(i, parcel);
                            sb2.append("\"");
                            sb2.append(n7.d.a(strI));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] bArrF = com.bumptech.glide.c.f(i, parcel);
                            sb2.append("\"");
                            sb2.append(bArrF == null ? null : Base64.encodeToString(bArrF, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] bArrF2 = com.bumptech.glide.c.f(i, parcel);
                            sb2.append("\"");
                            sb2.append(bArrF2 == null ? null : Base64.encodeToString(bArrF2, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle bundleE2 = com.bumptech.glide.c.e(i, parcel);
                            Set<String> setKeySet = bundleE2.keySet();
                            sb2.append("{");
                            boolean z10 = true;
                            for (String str4 : setKeySet) {
                                if (!z10) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(str4);
                                sb2.append("\":\"");
                                sb2.append(n7.d.a(bundleE2.getString(str4)));
                                sb2.append("\"");
                                z10 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            int iO10 = com.bumptech.glide.c.O(i, parcel);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iO10 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition11, iO10);
                                parcel.setDataPosition(iDataPosition11 + iO10);
                            }
                            parcelObtain.setDataPosition(0);
                            i0.i(str2);
                            i0.i(aVar.f6851u);
                            Map map4 = (Map) aVar.f6851u.f6866b.get(str2);
                            i0.i(map4);
                            e(sb2, map4, parcelObtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z4 = true;
            }
        }
        if (parcel.dataPosition() != iS) {
            throw new h7.b(v.f(iS, "Overread allowed size end="), parcel);
        }
        sb2.append('}');
    }

    public static final void f(StringBuilder sb2, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                i0.i(obj);
                sb2.append(n7.d.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                i0.i(obj);
                n7.c.o(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(v.f(i, "Unknown type = "));
        }
    }

    public static final void g(StringBuilder sb2, a aVar, Object obj) {
        boolean z4 = aVar.f6845c;
        int i = aVar.f6844b;
        if (!z4) {
            f(sb2, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            f(sb2, i, arrayList.get(i10));
        }
        sb2.append("]");
    }

    @Override // l7.b
    public final void addConcreteTypeArrayInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        ArrayList arrayList2 = new ArrayList();
        i0.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((d) ((b) arrayList.get(i))).c());
        }
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        int iP = com.bumptech.glide.d.P(i10, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void addConcreteTypeInternal(a aVar, String str, b bVar) {
        d(aVar);
        Parcel parcelC = ((d) bVar).c();
        int i = aVar.f6848r;
        Parcel parcel = this.f6854b;
        if (parcelC == null) {
            com.bumptech.glide.d.R(parcel, i, 0);
            return;
        }
        int iP = com.bumptech.glide.d.P(i, parcel);
        parcel.appendFrom(parcelC, 0, parcelC.dataSize());
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public final Parcel c() {
        int i = this.f6857f;
        Parcel parcel = this.f6854b;
        if (i != 0) {
            if (i != 1) {
                return parcel;
            }
            com.bumptech.glide.d.Q(this.f6858r, parcel);
            this.f6857f = 2;
            return parcel;
        }
        int iP = com.bumptech.glide.d.P(20293, parcel);
        this.f6858r = iP;
        com.bumptech.glide.d.Q(iP, parcel);
        this.f6857f = 2;
        return parcel;
    }

    public final void d(a aVar) {
        if (aVar.f6848r == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f6854b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.f6857f;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f6858r = com.bumptech.glide.d.P(20293, parcel);
            this.f6857f = 1;
        }
    }

    @Override // l7.b
    public final Map getFieldMappings() {
        h hVar = this.f6856d;
        if (hVar == null) {
            return null;
        }
        String str = this.e;
        i0.i(str);
        return (Map) hVar.f6866b.get(str);
    }

    @Override // l7.c, l7.b
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // l7.c, l7.b
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // l7.b
    public final void setBooleanInternal(a aVar, String str, boolean z4) {
        d(aVar);
        int i = aVar.f6848r;
        Parcel parcel = this.f6854b;
        com.bumptech.glide.d.R(parcel, i, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    @Override // l7.b
    public final void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        d(aVar);
        com.bumptech.glide.d.D(this.f6854b, aVar.f6848r, bArr, true);
    }

    @Override // l7.b
    public final void setIntegerInternal(a aVar, String str, int i) {
        d(aVar);
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        com.bumptech.glide.d.R(parcel, i10, 4);
        parcel.writeInt(i);
    }

    @Override // l7.b
    public final void setLongInternal(a aVar, String str, long j4) {
        d(aVar);
        int i = aVar.f6848r;
        Parcel parcel = this.f6854b;
        com.bumptech.glide.d.R(parcel, i, 8);
        parcel.writeLong(j4);
    }

    @Override // l7.b
    public final void setStringInternal(a aVar, String str, String str2) {
        d(aVar);
        com.bumptech.glide.d.K(this.f6854b, aVar.f6848r, str2, true);
    }

    @Override // l7.b
    public final void setStringMapInternal(a aVar, String str, Map map) {
        d(aVar);
        Bundle bundle = new Bundle();
        i0.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        com.bumptech.glide.d.C(this.f6854b, aVar.f6848r, bundle, true);
    }

    @Override // l7.b
    public final void setStringsInternal(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        com.bumptech.glide.d.L(this.f6854b, aVar.f6848r, strArr, true);
    }

    @Override // l7.b
    public final String toString() {
        h hVar = this.f6856d;
        i0.j(hVar, "Cannot convert to JSON on client side.");
        Parcel parcelC = c();
        parcelC.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.e;
        i0.i(str);
        Map map = (Map) hVar.f6866b.get(str);
        i0.i(map);
        e(sb2, map, parcelC);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f6853a);
        Parcel parcelC = c();
        if (parcelC != null) {
            int iP2 = com.bumptech.glide.d.P(2, parcel);
            parcel.appendFrom(parcelC, 0, parcelC.dataSize());
            com.bumptech.glide.d.Q(iP2, parcel);
        }
        com.bumptech.glide.d.J(parcel, 3, this.f6855c != 0 ? this.f6856d : null, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zab(a aVar, String str, BigDecimal bigDecimal) {
        d(aVar);
        int i = aVar.f6848r;
        Parcel parcel = this.f6854b;
        if (bigDecimal == null) {
            com.bumptech.glide.d.R(parcel, i, 0);
            return;
        }
        int iP = com.bumptech.glide.d.P(i, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zad(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        int iP = com.bumptech.glide.d.P(i10, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zaf(a aVar, String str, BigInteger bigInteger) {
        d(aVar);
        int i = aVar.f6848r;
        Parcel parcel = this.f6854b;
        if (bigInteger == null) {
            com.bumptech.glide.d.R(parcel, i, 0);
            return;
        }
        int iP = com.bumptech.glide.d.P(i, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zah(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        int iP = com.bumptech.glide.d.P(i10, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigIntegerArr[i11].toByteArray());
        }
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zak(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        int iP = com.bumptech.glide.d.P(i10, parcel);
        parcel.writeBooleanArray(zArr);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zan(a aVar, String str, double d10) {
        d(aVar);
        int i = aVar.f6848r;
        Parcel parcel = this.f6854b;
        com.bumptech.glide.d.R(parcel, i, 8);
        parcel.writeDouble(d10);
    }

    @Override // l7.b
    public final void zap(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        int iP = com.bumptech.glide.d.P(i10, parcel);
        parcel.writeDoubleArray(dArr);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zar(a aVar, String str, float f10) {
        d(aVar);
        int i = aVar.f6848r;
        Parcel parcel = this.f6854b;
        com.bumptech.glide.d.R(parcel, i, 4);
        parcel.writeFloat(f10);
    }

    @Override // l7.b
    public final void zat(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        int iP = com.bumptech.glide.d.P(i10, parcel);
        parcel.writeFloatArray(fArr);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // l7.b
    public final void zaw(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        com.bumptech.glide.d.G(this.f6854b, aVar.f6848r, iArr, true);
    }

    @Override // l7.b
    public final void zaz(a aVar, String str, ArrayList arrayList) {
        d(aVar);
        i0.i(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        int i10 = aVar.f6848r;
        Parcel parcel = this.f6854b;
        int iP = com.bumptech.glide.d.P(i10, parcel);
        parcel.writeLongArray(jArr);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
