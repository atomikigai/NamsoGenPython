package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f10825j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10829d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10831g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10825j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f10857f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f10825j.get(index)) {
                case 1:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.f10828c = typedArrayObtainStyledAttributes.getInt(index, this.f10828c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = v.a.f9104a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f10826a = m.g(typedArrayObtainStyledAttributes, index, this.f10826a);
                    break;
                case 6:
                    this.f10827b = typedArrayObtainStyledAttributes.getInteger(index, this.f10827b);
                    break;
                case 7:
                    this.f10829d = typedArrayObtainStyledAttributes.getFloat(index, this.f10829d);
                    break;
                case 8:
                    this.f10831g = typedArrayObtainStyledAttributes.getInteger(index, this.f10831g);
                    break;
                case 9:
                    this.f10830f = typedArrayObtainStyledAttributes.getFloat(index, this.f10830f);
                    break;
                case 10:
                    int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i10 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
