package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f10836n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f10837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10840d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10842g;
    public int h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10846m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10836n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f10836n.get(index)) {
                case 1:
                    this.f10837a = typedArrayObtainStyledAttributes.getFloat(index, this.f10837a);
                    break;
                case 2:
                    this.f10838b = typedArrayObtainStyledAttributes.getFloat(index, this.f10838b);
                    break;
                case 3:
                    this.f10839c = typedArrayObtainStyledAttributes.getFloat(index, this.f10839c);
                    break;
                case 4:
                    this.f10840d = typedArrayObtainStyledAttributes.getFloat(index, this.f10840d);
                    break;
                case 5:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f10841f = typedArrayObtainStyledAttributes.getDimension(index, this.f10841f);
                    break;
                case 7:
                    this.f10842g = typedArrayObtainStyledAttributes.getDimension(index, this.f10842g);
                    break;
                case 8:
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f10843j = typedArrayObtainStyledAttributes.getDimension(index, this.f10843j);
                    break;
                case 10:
                    this.f10844k = typedArrayObtainStyledAttributes.getDimension(index, this.f10844k);
                    break;
                case 11:
                    this.f10845l = true;
                    this.f10846m = typedArrayObtainStyledAttributes.getDimension(index, this.f10846m);
                    break;
                case 12:
                    this.h = m.g(typedArrayObtainStyledAttributes, index, this.h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
