package g1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import fa.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f4172d;
    public boolean e = true;

    public f(TextView textView) {
        this.f4171c = textView;
        this.f4172d = new d(textView);
    }

    @Override // fa.c1
    public final void C(boolean z4) {
        if (z4) {
            H();
        }
    }

    @Override // fa.c1
    public final void D(boolean z4) {
        this.e = z4;
        H();
        TextView textView = this.f4171c;
        textView.setFilters(u(textView.getFilters()));
    }

    public final void H() {
        TextView textView = this.f4171c;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.e) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f4178a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // fa.c1
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        if (!this.e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f4172d;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }
}
